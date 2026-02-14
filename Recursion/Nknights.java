package Recursion;

public class Nknights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[3][3];
        helper(board, 0, 0, 3);

    }


    static void helper(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }
        if (row == board.length) return;

        if (col == board.length) {
            helper(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            helper(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        helper(board, row, col + 1, knights);


    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) return false;
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) return false;
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) return false;
        }
        if (isValid(board, row - 1, col - 2)) {
            return !board[row - 1][col - 2];
        }

        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {

        return row >= 0 && col >= 0 && row < board.length && col < board.length;

    }

    static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    System.out.print("k ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
