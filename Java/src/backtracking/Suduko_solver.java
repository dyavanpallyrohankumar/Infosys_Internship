package backtracking;

class Suduko_Solver {

	// private static final int SIZE = 9;

	// private static final int EMPTY = 0;

	public static void main(String[] args) {

		int[][] puzzle = {

				{ 0, 5, 0, 0, 2, 0, 0, 0, 0 }, { 0, 6, 0, 0, 0, 4, 8, 9, 0 }, { 0, 1, 0, 0, 0, 0, 2, 7, 0 },
				{ 0, 0, 6, 9, 0, 0, 0, 3, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 9, 8, 0, 0, 1, 3, 0, 4, 0 },
				{ 0, 7, 0, 2, 0, 5, 4, 6, 0 }, { 0, 0, 5, 6, 0, 1, 0, 0, 0 }, { 0, 0, 0, 8, 0, 0, 0, 0, 0 } };

		SudokuBoard board = new SudokuBoard(puzzle);

		if (board.solve()) {
			System.out.println("Solved Sudoku:");
			board.print();

		} else {
			System.out.println("Unsolvable Sudoku.");

		}
	}
}