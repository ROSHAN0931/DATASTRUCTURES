#include<stdio.h>
#include<stdlib.h>

struct node
{
    int info;
    struct node *lchild;
    struct node *rchild;
};

void inorder(struct node *);
void insert();

struct node *root=NULL;

int main()
{
    int choice;
    while(1)
    {
        printf("\n1.insert\n2.inorder\n3.exit\n");
        printf("Enter the choice\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:insert();
                break;

            case 2:
                if(root==NULL)
                {
                    printf("Tree is empty\n");
                }
                else
                {
                    inorder(root);
                    break;
                }
            
            case 3:exit(0);

            default:printf("Enter the valid choice\n");
        }
    }
}

void inorder(struct node *temp)
{
    if(temp!=NULL)
    {
        inorder(temp->lchild);
        printf("%d\t",temp->info);
        inorder(temp->rchild);
    }
}

void insert()
{
    struct node *temp,*ptr,*par;
    int item;
    temp=(struct node*)malloc(sizeof(struct node));
    if(temp==NULL)
    {
        printf("Memory is not allocated\n");
    }
    else
    {
        printf("Enter the value to be inserted\n");
        scanf("%d",&item);
        temp->info=item;
        temp->lchild=NULL;
        temp->rchild=NULL;
        if(root==NULL)
        {
            root=temp;
        }
        else
        {
            ptr=root;
            while(ptr!=NULL)
            {
                par=ptr;
                if(item < ptr->info)
                {
                    ptr=ptr->lchild;
                }
                else if(item > ptr->info)
                {
                    ptr=ptr->rchild;
                }
                else
                {
                    printf("Duplicate element cannot be inserted\n");
                    break;
                }
            }

            if(ptr==NULL)
            {
                if(item < par->info)
                {
                    par -> lchild=temp;
                }
                else
                {
                    par -> rchild=temp;
                }
            }
        }
    }
}