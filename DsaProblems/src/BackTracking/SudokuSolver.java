public class SudokuSolver {
    private static final int N = 9;

    public static boolean solve(int[][] board, int row, int col) {
        if (row == N) {
            // solution found
            return true;
        }

        if (col == N) {
            // move to the next row
            return solve(board, row+1, 0);
        }

        if (board[row][col] != 0) {
            // cell already filled, move to next column
            return solve(board, row, col+1);
        }

        // try all possible values in the current cell
        for (int num = 1; num <= N; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;
                if (solve(board, row, col+1)) {
                    return true;
                }
                board[row][col] = 0; // undo the choice
            }
        }

        // no valid value found, backtrack
        return false;
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        // check row
        for (int i = 0; i < N; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // check column
        for (int i = 0; i < N; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // check 3x3 subgrid
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        // valid choice
        return true;
    }

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {0, 6, 7, 0, 0, 0, 1, 0, 0},
                {0, 0, 2, 3, 0, 7, 0, 0, 6},
                {0, 0, 0, 4, 0, 0, 0, 0, 0},
                {0, 0, 9, 0, 1, 0, 0, 0, 0},
                {3, 0, 0, 7, 0, 9, 5, 0, 0},
                {0, 0, 0, 0, 4, 0, 0, 0, 7},
                {0, 0, 3, 6, 0, 2, 0, 0, 1},
                {5, 0, 0, 0, 0, 0, 0, 8, 0},
                {0, 0, 0, 0, 9, 0, 0, 0, 0},
        };

        if (solve(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }

    }

    private static void printBoard(int[][] board) {
        for(int[] arr : board){
            for(int i : arr){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
