package Recursion;
import java.util.Arrays;
public class KnightTour {
    public static void main(String[] args) {
        int n = 3;
        int[][] board = new int[n][n];
        for(int[] a:board) Arrays.fill(a,-1);
        helper(board, 0, 0, 0);
    }

    static void helper(int[][] board, int i, int j, int count) {

        if (i < 0 || j < 0 || i >= board.length || j >= board.length || board[i][j]>=0 ) return;

        board[i][j]=count;
        if (count == board.length*board.length-1) {
            display(board);
            System.out.println();
            board[i][j]=-1;
            return;
        }
        helper(board, i - 1, j - 2, count + 1);
        helper(board, i - 1, j + 2, count + 1);
        helper(board, i - 2, j - 1, count + 1);
        helper(board, i + 1, j + 2, count + 1);
        helper(board, i + 1, j - 2, count + 1);
        helper(board, i - 2, j + 1, count + 1);
        helper(board, i + 2, j - 1, count + 1);
        helper(board, i + 2, j + 1, count + 1);

        board[i][j]=-1;
    }



    static private void display(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
