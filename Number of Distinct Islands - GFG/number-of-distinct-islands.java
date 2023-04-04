//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution {

 

    int countDistinctIslands(int[][] grid) {

        int n=grid.length;

        int m=grid[0].length;

        HashSet<ArrayList<String>> set=new HashSet<>();

        boolean visit[][]=new boolean[n][m];

        int dr[]={-1,0,1,0};

        int dc[]={0,-1,0,1};

        for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                if(grid[i][j]==1 && !visit[i][j]){

                    ArrayList<String> l=new ArrayList<>();

                    bfs(grid, i, j, i, j,n, m,l,visit, dr,dc);

                    set.add(l);

                }

            }

        }

        return set.size();

       

    }

    void bfs(int grid[][], int x, int y,int xr,int yc, int n, int m, ArrayList<String> l,

                                            boolean visit[][], int dr[], int dc[]){

                   visit[x][y]=true;

                   Queue<pair> q=new LinkedList<>();

                   l.add(""+(x-xr)+(y-yc));

                 q.add(new pair(x,y));

                 while(!q.isEmpty()){

                    pair p=q.poll();

                    int a=p.a;

                    int b=p.b;

                    for(int i=0; i<4; i++){

                        int xx=a+dr[i];

                        int yy=b+dc[i];

                        if(xx>=0 && xx<n && yy>=0 && yy<m && grid[xx][yy]==1 && !visit[xx][yy]){

                            visit[xx][yy]=true;

                            int t1=xx-xr;

                            int t2=yy-yc;

                            l.add(""+t1+t2);

                            q.add(new pair(xx,yy));

                        }

                    }

                 }

                   

        

    }

}

class pair{

    int a;

    int b;

    pair(int a, int b){

        this.a=a;

        this.b=b;

    }

}