package test_crack;

import java.util.ArrayList;
import java.util.List;

class _54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        if (matrix.length==0 || matrix[0].length==0) return res; 
        loop(new int[][] {{0,0},{0,matrix[0].length-1},{matrix.length-1,matrix[0].length-1},{matrix.length-1,0}},res,matrix);
        return res;
    }
    
    public void loop(int[][] bd, List<Integer> res, int[][] matrix) {
    	int i = -1;
    	if (bd[0][1]<=bd[1][1]) for (i=bd[0][1];i<=bd[1][1];i++) res.add(matrix[bd[0][0]][i]);
    	else return;
    	
    	if (bd[1][0]+1<=bd[2][0]) for (i=bd[1][0]+1;i<=bd[2][0];i++) res.add(matrix[i][bd[1][1]]);
    	else return;
    	
    	if (bd[2][1]-1>=bd[3][1]) for (i=bd[2][1]-1;i>=bd[3][1];i--) res.add(matrix[bd[2][0]][i]);
    	else return;
    	
    	if (bd[3][0]-1>=bd[0][0]+1) for (i=bd[3][0]-1;i>=bd[0][0]+1;i--) res.add(matrix[i][bd[3][1]]);
    	else return;
    	
    	bd[0][0]++;
    	bd[0][1]++;
    	bd[1][0]++;
    	bd[1][1]--;
    	bd[2][0]--;
    	bd[2][1]--;
    	bd[3][0]--;
    	bd[3][1]++;

    	loop(bd,res,matrix);
    }
}
