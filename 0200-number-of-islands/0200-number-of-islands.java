class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length, m=grid[0].length;
        int[][] vis = new int[n][m];
        
        int count = 0;
        int[] delrow = {0, -1, 0, 1};
        int[] delcol = {-1, 0, 1, 0};
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    dfs(grid, vis, i, j, delrow, delcol);
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private void dfs(char[][] grid, int[][]vis, int row, int col, int[] delrow, int[] delcol){
        vis[row][col] = 1;
        int n=grid.length, m=grid[0].length;
        
        for(int i=0; i<4; i++){
            int r = delrow[i] + row;
            int c = delcol[i] + col;
            
            if(r>=0 && r<n && c>=0 && c<m && grid[r][c]=='1' && vis[r][c]==0)
                dfs(grid, vis, r, c, delrow, delcol);
        }
    }
}