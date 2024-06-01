#include<stdio.h>
#include<stdlib.h>

void dfs(int);
int graph[10][10],visited[10],total;
int arr[30],count=0;
static int k=0;

int main()
{
    int i,j;
    printf("Enter the total number of vertex:\n");
    scanf("%d",&total);

    printf("Enter the adjacency matrix:\n");
    for(i=0;i<total;i++)
    {
        for(j=0;j<total;j++)
        {
            scanf("%d",&graph[i][j]);
        }
    }

    for(i=0;i<total;i++)
    {
        visited[i]=0;
    }
    dfs(0);
}

void dfs(int vertex)
{
    int j,c=0;
    count++;
    printf("%d",vertex);
    visited[vertex]=1;

    for(j=0;j<total;j++)
    {
        if(!visited[j] && graph[vertex][j]==1)
        {
            arr[++k]=j;
            c=1;
        }

        if(count==total)
        {
            exit(0);
        }
    }

    if(c==1)
    {
        dfs(arr[k]);
    }
    else
    {
        k--;
        dfs(arr[k]);
    }
}