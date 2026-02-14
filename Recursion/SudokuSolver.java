package Recursion;

class SudokuSolver {
    public static void main(String[] args) {

    }
    static public void solveSudoku(int[][] mat) {

        solve(mat);
    }

    static boolean solve(int[][] board){
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=false;
                    break;
                }
            }
            if(emptyLeft==false) break;
        }

        if(emptyLeft==true) return true;

        for(int number=1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col] = number;

                if(solve(board)) return true;
                else board[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isSafe(int[][]board,int row,int col,int num){
        //check the row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num) return false;
        }

        //check the col
        for(int[] nums:board){
            if(nums[col]==num) return false;
        }

        //check grid
        int sqrt=(int)(Math.sqrt(board.length));
        int rowStart=row-row%sqrt;
        int colStart=col-col%sqrt;
        for(int r=rowStart;r<rowStart+sqrt;r++){
            for(int c=colStart;c<colStart+sqrt;c++){
                if(board[r][c]==num){
                    return false;
                }
            }


        }
        return true;
    }
}
