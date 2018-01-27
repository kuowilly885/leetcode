package test_crack;

class _130 {
	final int RIGHT = 0;
	final int LEFT = 1;
	final int DOWN = 2;
	final int UP = 3;

    public void solve(char[][] board) {
    	if (board == null) return;
    	int rows = board.length;
    	if (rows == 0) return;
    	int cols = board[0].length;
    	dfsSide(0, 0, board,RIGHT);
    	for (int i = 0 ; i < rows ; i++)
    		for (int j = 0 ; j < cols ; j++)
    			board[i][j] = board[i][j] == 'O' ? 'X' : board[i][j] == 'V' ? 'O' : board[i][j];
    }

    private boolean valid(int i, int j, char[][] board) {
    	return i < board.length && i >= 0 && j < board[0].length && j >= 0;
    }
    
    private void dfsSide(int i, int j, char[][] board, int dir) {
    	if (board[i][j] == 'O') dfs(i,j,board);
    	switch (dir) {
    		case RIGHT:
    			if (valid(i,j+1,board)) dfsSide(i,j+1,board, RIGHT);
    			else if (valid(i+1,j,board)) dfsSide(i+1,j,board, DOWN);
    			break;
    		case DOWN:
    			if (valid(i+1,j,board)) dfsSide(i+1,j,board, DOWN);
    			else if (valid(i,j-1,board)) dfsSide(i,j-1,board, LEFT);
    			break;
    		case LEFT:
    			if (valid(i,j-1,board)) dfsSide(i,j-1,board, LEFT);
    			else if (valid(i-1,j,board) && i-1 != 0) dfsSide(i-1,j,board, UP);
    			break;
    		case UP:
    			if (valid(i-1,j,board) && i-1 != 0) dfsSide(i-1,j,board, UP);
    	}
    }
    
    private void dfs(int i, int j, char[][] board) {
    	board[i][j] = 'V';
    	if (valid(i,j+1,board) && board[i][j+1] == 'O') dfs(i,j+1,board);
    	if (valid(i+1,j,board) && board[i+1][j] == 'O') dfs(i+1,j,board);
    	if (valid(i,j-1,board) && board[i][j-1] == 'O') dfs(i,j-1,board);
    	if (valid(i-1,j,board) && board[i-1][j] == 'O') dfs(i-1,j,board);
    }
}
