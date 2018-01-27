package test_crack;

import java.util.HashSet;
import java.util.Set;

class _79 {
    public boolean exist(char[][] board, String word) {
    	if (word == null || word.length() == 0 || board == null) return false;
    	int rows = board.length;
    	if (rows == 0) return false;
    	int cols = board[0].length;
    	boolean [][] visit = new boolean[rows][cols];
    	
        for (int i = 0 ; i < rows ; i++) {
        	for (int j = 0 ; j < cols ; j++) {
        		if (board[i][j] == word.charAt(0)) {
        			if (bt(i,j,board,visit,word,0)) return true;
        		}
        	}
        }
        
        return false;
    }
    
    private boolean bt(int i, int j, char[][] board, boolean [][] visit, String word, int wordI) {
    	
    	if (wordI == word.length() - 1) return true;
    	visit[i][j] = true;
    	boolean res = false;
    	
    	// down
    	res = cValid(i+1,j,board,visit,wordI+1,word);
    	if (res) return res;
    	// right
    	res = cValid(i,j+1,board,visit,wordI+1,word);
    	if (res) return res;
    	// left
    	res = cValid(i,j-1,board,visit,wordI+1,word);
    	if (res) return res;
    	// up
    	res = cValid(i-1,j,board,visit,wordI+1,word);
    	if (res) return res;
    	
    	visit[i][j] = false;
    	
    	return res;
    }
    
    private boolean cValid(int i, int j, char board[][], boolean [][] visit, int wordI, String word) {
    	boolean res = false;
    	if (bValid(i,j,board) && wValid(wordI,word) && word.charAt(wordI) == board[i][j] && !visit[i][j])
    		res = bt(i, j, board, visit, word, wordI);
    	return res;
    }
    
    private boolean wValid(int i, String word) {
    	if (word == null) return false;
    	return i < word.length() && i >= 0;
    }
    
    private boolean bValid(int i, int j, char[][] board) {
    	return i < board.length && i >= 0 && j < board[0].length && j >= 0;
    }
}

