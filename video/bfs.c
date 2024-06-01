
#include <stdio.h>
void bfs(int);
int graph[10][10],visited[10],total;

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
    bfs(0);
}

void bfs(int vertex)
{
    int j;
    printf("%d\t",vertex);
    visited[vertex]=1;
    
    for(j=0;j<total;j++)
    {
        if(!visited[j] && graph[vertex][j]==1)
        {
            bfs(j);
        }
    }
}