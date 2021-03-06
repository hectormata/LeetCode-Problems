import java.util.LinkedList;

public class Minesweeper {

	public static char[][] updateBoard(char[][] board, int[] click) {
		
		int m = board.length;
		int n = board[0].length;
		int row = click[0];
		int col = click[1];
		
		if (board[row][col] == 'M') {
			board[row][col] = 'X';
		}
		
		else {
			
			int count = 0;
			for (int i = -1; i < 2; i++) {
				
				for (int j = -1; j < 2; j++) {
					
					if (i == 0 && j == 0) {
						continue;
					}
					
					int r = row + i;
					int c = col + j;
					
					if (r < 0 || r >= m || c < 0 || c < 0 || c >= n) {
						continue;
					}
					
					if (board[r][c] == 'M' || board[r][c] == 'X') {
						count++;
					}
				}
			}
			
			if (count > 0) {
				
				board[row][col] = (char)(count + '0');
			}
			
			else {
				
				board[row][col] = 'B';
				for (int i = -1; i < 2; i++) {
					for (int j = -1; j < 2; j++) {
						
						if (i == 0 && j == 0) {
							continue;
						}
						
						int r = row + i;
						int c = col + j;
						
						if (r < 0 || r >= m || c < 0 || c < 0 || c >= n) {
							continue;
						}
						
						if (board[r][c] == 'E') {
							updateBoard(board, new int[] {r, c});
						}
					}
				}
			}
		}
		
		return board;
	}
  
	public static void main(String[] args) {
		
		char[][] board = {{'E', 'E', 'E', 'E', 'E'},
				{'E', 'E', 'M', 'E', 'E'},
				{'E', 'E', 'E', 'E', 'E'},
				{'E', 'E', 'E', 'E', 'E'}};
		
		int[] click = {3, 0};
		
		System.out.println(updateBoard(board, click));
	}
}
