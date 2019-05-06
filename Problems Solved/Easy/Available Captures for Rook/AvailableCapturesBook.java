/*
 * On an 8 x 8 chessboard, there is one white rook.  There also may be empty 
 * squares, white bishops, and black pawns.  These are given as characters 
 * 'R', '.', 'B', and 'p' respectively. Uppercase characters represent white 
 * pieces, and lowercase characters represent black pieces.
 * 
 * The rook moves as in the rules of Chess: it chooses one of four cardinal 
 * directions (north, east, west, and south), then moves in that direction 
 * until it chooses to stop, reaches the edge of the board, or captures an 
 * opposite colored pawn by moving to the same square it occupies.  Also, rooks
 * cannot move into the same square as other friendly bishops.
 * 
 * Return the number of pawns the rook can capture in one move.
 * 
 * Example 1:
 * 
 * Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],
 * [".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],
 * [".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],
 * [".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * 
 * Output: 3
 * 
 * Explanation: 
 * In this example the rook is able to capture all the pawns.
 * 
 * Example 2:
 * 
 * Input: [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],
 * [".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],
 * [".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],
 * [".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * Output: 0
 * 
 * Explanation: 
 * 
 * Bishops are blocking the rook to capture any pawn.
 * 
 * Example 3:
 * 
 * Input: [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],
 * [".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],
 * [".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],
 * [".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
 * Output: 3
 * 
 * Explanation: 
 * The rook can capture the pawns at positions b5, d6 and f5.
 */
public class AvailableCapturesBook {

	static int res;
	static char[][] board;

	public int numRookCaptures(char[][] board) {
		AvailableCapturesBook.board = board;
		int[] rook = findRook(board);
		return killPown(rook[0], rook[1]);
	}

	public static int killPown(int r, int c) {
		int n = moveNorth(r, c);
		// System.out.println(n);
		int s = moveSouth(r, c);
		// System.out.println(s);
		int e = moveEast(r, c);
		// System.out.println(e);
		int w = moveWest(r, c);
		// System.out.println(w);
		return (n + s + e + w);
	}

	private static int moveWest(int r, int c) {
		if (!inRange(r, c))
			return 0;
		if (board[r][c] == 'p')
			return 1;
		return moveWest(r, c + 1);
	}

	private static int moveEast(int r, int c) {
		if (!inRange(r, c))
			return 0;
		if (board[r][c] == 'p')
			return 1;
		return moveEast(r, c - 1);
	}

	private static int moveSouth(int r, int c) {
		if (!inRange(r, c))
			return 0;
		if (board[r][c] == 'p')
			return 1;
		return moveSouth(r + 1, c);
	}

	private static int moveNorth(int r, int c) {
		if (!inRange(r, c))
			return 0;
		if (board[r][c] == 'p')
			return 1;
		return moveNorth(r - 1, c);
	}

	private static boolean inRange(int r, int c) {
		if (r < 0 || c < 0 || r > 7 || c > 7)
			return false;
		if (board[r][c] == 'B')
			return false;
		return true;
	}

	public static int[] findRook(char[][] board) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j] == 'R')
					return new int[] { i, j };
			}
		}
		return null;
	}

	public static void main(String[] args) {

		char[][] input = { { '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', 'p', '.', '.', '.', '.' },
				{ '.', '.', '.', 'R', '.', '.', '.', 'p' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', 'p', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' },
				{ '.', '.', '.', '.', '.', '.', '.', '.' } };

		AvailableCapturesBook tmp = new AvailableCapturesBook();

		System.out.println(tmp.numRookCaptures(input));
	}
}
