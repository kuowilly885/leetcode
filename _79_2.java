package test_crack;

import java.util.HashSet;
import java.util.Set;

class _79_2 {
    public boolean exist(char[][] board, String word) {
    	if (word == null || word.length() == 0 || board == null) return false;
    	int rows = board.length;
    	if (rows == 0) return false;
    	return bt(0,0,board,new HashSet<>(),word,0);
    }
    
    private boolean bt(int i, int j, char[][] board, Set<String> set, String word, int wordI) {
    	if (board[i][j] == word.charAt(wordI)) {
    		if (!set.contains((""+i)+j)) {
    			set.add((""+i)+j);
    			if (wordI == word.length() - 1) {
    				return true;
    			} else {
    				if (wValid(wordI+1,word) && bValid(i+1,j,board))
    					if (bt(i+1, j, board, new HashSet<>(set), word, wordI+1)) return true;
    				
    				if (wValid(wordI+1,word) && bValid(i,j+1,board))
    					if (bt(i, j+1, board, new HashSet<>(set), word, wordI+1)) return true;
    				
    				if (wValid(wordI+1,word) && bValid(i,j-1,board))
    					if (bt(i, j-1, board, new HashSet<>(set), word, wordI+1)) return true;
    				
    				if (wValid(wordI+1,word) && bValid(i-1,j,board))
    					if (bt(i-1, j, board, new HashSet<>(set), word, wordI+1)) return true;
    				
    				return false;
    			}

    		} else
    			return false;
    	} else {
    		
    		if (set.contains((""+i)+j)) return false;
    		else {
    			set.add((""+i)+j);
    			if (board[i][j] == word.charAt(0))
    				if (bt(i, j, board, new HashSet<>(), word, 0)) return true;
    			
    			if (wValid(0,word) && bValid(i+1,j,board))
    				if (bt(i+1, j, board, set, word, 0)) return true;
    			
    			if (wValid(0,word) && bValid(i,j+1,board))
    				if (bt(i, j+1, board, set, word, 0)) return true;
    			
    			if (wValid(0,word) && bValid(i,j-1,board))
    				if (bt(i, j-1, board, set, word, 0)) return true;
    			
    			if (wValid(0,word) && bValid(i-1,j,board))
    				if (bt(i-1, j, board, set, word, 0)) return true;
    			
    			return false;
    		}
    	}
    }

    private boolean wValid(int i, String word) {
    	if (word == null) return false;
    	return i < word.length() && i >= 0;
    }
    
    private boolean bValid(int i, int j, char[][] board) {
    	return i < board.length && i >= 0 && j < board[0].length && j >= 0;
    }
}
