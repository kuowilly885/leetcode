package test_crack;

public class _200 {
    public int numIslands(char[][] grid) {
    	if (grid == null) return 0;
    	int rows = grid.length;
    	if (rows == 0) return 0;
    	int cols = grid[0].length;
    	int res = 0;
        for (int i = 0 ; i < rows ; i++) {
        	for (int j = 0 ; j < cols ; j++) {
        		if (grid[i][j] == '1') {
        			res++;
        			dfs(i,j,grid);
        		}
        	}
        }
        return res;
    }
    
    private void dfs(int i, int j, char[][] grid) {
    	grid[i][j] = '2';
    	if (i+1 < grid.length && grid[i+1][j] == '1') dfs(i+1, j, grid);
    	if (i-1 >= 0 && grid[i-1][j] == '1') dfs(i-1, j, grid);
    	if (j+1 < grid[0].length && grid[i][j+1] == '1') dfs(i, j+1, grid);
    	if (j-1 >= 0 && grid[i][j-1] == '1') dfs(i, j-1, grid);
    }
}
