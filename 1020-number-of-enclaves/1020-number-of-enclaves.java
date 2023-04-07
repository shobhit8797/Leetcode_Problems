class Solution {
    int[] drow = {0, -1, 0, 1};
    int[] dcol = {-1, 0, 1, 0};

    public void dfs(int[][] grid, int[][] vis, int row, int col){
        int m = grid.length, n = grid[0].length;
        vis[row][col] = 1;

        for(int i=0; i<4; i++){
            int rt = row + drow[i];
            int ct = col + dcol[i];

            if(rt>=0 && ct >=0 && rt<m && ct<n && vis[rt][ct] == 0 && grid[rt][ct] == 1)
            dfs(grid, vis, rt, ct);
        }
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;

        int[][] vis =  new int[m][n];

        for(int i=0; i<m; i++){
            if(grid[i][0] == 1)
            dfs(grid, vis, i, 0);
            if(grid[i][n-1] == 1)
            dfs(grid, vis, i, n-1);
        }

        for(int i=0; i<n; i++){
            if(grid[0][i] == 1)
            dfs(grid, vis, 0, i);
            if(grid[m-1][i] == 1)
            dfs(grid, vis, m-1, i);
        }

        int count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(vis[i][j] == 0 && grid[i][j] == 1) count++;
            }
        }

        return count;

    }
}