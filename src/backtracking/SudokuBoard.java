package backtracking;

class SudokuBoard {

    private int[][] board;

    public SudokuBoard(int[][] board) {
        this.board = board;
    }

    public boolean solve() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(row, col, num)) {
                            board[row][col] = num;

                            if (solve())
                                return true;

                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Puzzle solved
    }

    private boolean isSafe(int row, int col, int num) {
        return isRowSafe(row, num) &&
               isColSafe(col, num) &&
               isBoxSafe(row - row % 3, col - col % 3, num);
    }

    private boolean isRowSafe(int row, int num) {
        for (int col = 0; col < 9; col++) {
            if (board[row][col] == num)
                return false;
        }
        return true;
    }

    private boolean isColSafe(int col, int num) {
        for (int row = 0; row < 9; row++) {
            if (board[row][col] == num)
                return false;
        }
        return true;
    }

    private boolean isBoxSafe(int boxStartRow, int boxStartCol, int num) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[boxStartRow + row][boxStartCol + col] == num)
                    return false;
            }
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("------+------+------");
            }

            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0)
                    System.out.print("| ");

                System.out.print(board[i][j] == 0 ? ". " : board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
