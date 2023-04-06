class Solution {
    private void dfs(int[][] grid, int[][] vis, int row, int col){
        int n=grid.length, m=grid[0].length;
        vis[row][col] = 1;
        int[] delrow = {0, -1, 0, 1};
        int[] delcol = {-1, 0, 1, 0};
        
        for(int i=0; i<4; i++){
            int r = row+delrow[i];
            int c = col+delcol[i];
            
            if(r>=0 && r<n && c>=0 && c<m && grid[r][c]==0 && vis[r][c]==0)
                dfs(grid, vis, r, c);
        }
    }
    public int closedIsland(int[][] grid){
        int n=grid.length, m=grid[0].length;
        
        int[][] vis = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if((grid[i][j] == 0 && vis[i][j] == 0) && (i==0 || i==n-1 || j==0 || j==m-1)){
                    dfs(grid, vis, i, j);
                }
            }
        }
        int count = 0;
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(grid[i][j] == 0 && vis[i][j] == 0){
                    count++;
                    dfs(grid, vis, i, j);
                }
            }
        }
        
        return count;
    }
}