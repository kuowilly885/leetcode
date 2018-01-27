package test_crack;

import java.util.ArrayList;
import java.util.List;

class _417 {
    public List<int[]> pacificAtlantic(int[][] matrix) {
    	List<int[]> list = new ArrayList<int[]>();
        int rows=matrix.length,cols=matrix[0].length;
        boolean[][] pac=new boolean[rows][cols],atl=new boolean[rows][cols];
        for (int i=0;i<rows;i++)
        	if (i==0) for (int j=0;j<cols;j++) if (!pac[i][j]) DFS(matrix,i,j,pac,null,null);
        	else if (!pac[i][0]) DFS(matrix,i,0,pac,null,null);
        for (int i=rows-1;i>=0;i--)
        	if (i==rows-1) for (int j=cols-1;j>=0;j--) if (!atl[i][j]) DFS(matrix,i,j,pac,atl,list);
        	else if (!atl[i][cols-1]) DFS(matrix,i,cols-1,pac,atl,list);
        return list;
    }
        
    void DFS (int[][] grid, int i, int j, boolean[][] pac, boolean[][] atl, List<int[]> list) {
    	boolean[][] chk;
    	if (list == null) chk = pac;
    	else {
    		chk = atl;
    		if (pac[i][j]) list.add(new int[] {i,j});
    	}
    	chk[i][j] = true;
    	if (valid(grid,i+1,j,i,j,chk)) DFS(grid,i+1,j,pac,atl,list);
    	if (valid(grid,i-1,j,i,j,chk)) DFS(grid,i-1,j,pac,atl,list);
    	if (valid(grid,i,j+1,i,j,chk)) DFS(grid,i,j+1,pac,atl,list);
    	if (valid(grid,i,j-1,i,j,chk)) DFS(grid,i,j-1,pac,atl,list);
    }
    
    boolean valid(int[][] grid, int i, int j, int I, int J, boolean[][] chk) {
    	return (i<grid.length && i>=0 && j<grid[0].length && j>=0) && !chk[i][j] && grid[i][j]>=grid[I][J];
    }
}
