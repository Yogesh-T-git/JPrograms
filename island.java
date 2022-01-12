import java.util.*;

public class island {
    static int find(int i, int[] parent)
    {
        int p = i;
        while(parent[p] >= 0)
            p = parent[p];
        return p;
    }
    
    static void Union(int i, int j, int[] parent)
    {
        int u = find(i, parent), v = find(j, parent);
        if(u == v)
            return;
        if(parent[u] <= parent[v])
        {
            parent[u] += parent[v];
            parent[v] = u;
        }
        else
        {
            parent[v] += parent[u];
            parent[u] = v;
        }
    }
    

    static int countIsland(int[][] is,int n,int m){
        int parent[] = new int[n*m];
        for(int i=0; i<n*m; i++) parent[i] = -1;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(is[i][j] == 0)
                    continue;
                int node = i * m + j;
                if(i-1 >= 0)
                {
                    if(is[i-1][j] == 1)
                        Union(node, (i-1)*m + j, parent);
                    if(j-1 >= 0 && is[i-1][j-1] == 1)
                        Union(node, (i-1)*m + j - 1 , parent);
                    if(j+1 < m && is[i-1][j+1] == 1)
                        Union(node, (i-1)*m + j + 1, parent);
                }
                if(i+1 < n)
                {
                    if(is[i+1][j] == 1)
                        Union(node, (i+1)*m + j, parent);
                    if(j-1 >= 0 && is[i+1][j-1] == 1)
                        Union(node, (i+1)*m + j - 1 , parent);
                    if(j+1 < m && is[i+1][j+1] == 1)
                        Union(node, (i+1)*m + j + 1, parent);
                }
                if(j-1 >= 0 && is[i][j-1] == 1)
                    Union(node, i*m + j - 1, parent);
                if(j+1 < n && is[i][j+1] == 1)
                    Union(node, i*m + j + 1, parent);
            }
        }
        int count = 0;
        
        boolean[] flag = new boolean[n*m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(is[i][j] == 1)
                {
                    int par = find(i*m + j, parent);
                    if(!flag[par])
                    {
                        count++;
                        flag[par] = true;
                    }
                }
            }
        }
        return count;
    }

    
    public static  void main(String[] args){
        int[][] is ={ {1, 1, 0, 0, 0},
                      {0, 1, 1, 0, 1},
                      {1, 0, 0, 1, 1},
                      {0, 0, 0, 0, 0},
                      {1, 1, 1, 1, 1}
                    };

        int n=5, m=5;
        System.out.println("Number of islands are: " + countIsland(is, n, m));
    }
}
