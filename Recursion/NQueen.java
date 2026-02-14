package Recursion;
import java.util.ArrayList;

public class NQueen {
    static ArrayList<ArrayList<Integer>>list;
    public static void main(String[] args) {
        int n=4;
        boolean[][] arr=new boolean[n][n];
        list=new ArrayList<>();
        helper(arr,0);
        System.out.println(list);
    }
    private static void helper(boolean[][] arr,int row){
           if(row==arr.length){
               addArraytoList(arr);
               return;
           }


            for(int col=0;col<arr.length;col++){
                if(isSafe(arr,row,col)){
                    arr[row][col] = true;
                    helper(arr,row+1);
                    arr[row][col]=false;
                }

        }
    }

    private static boolean isSafe(boolean[][] arr, int row, int col) {

        // check vertical
        for(int i=row;i>=0;i--){
            if(arr[i][col]== true) return false;
        }

        // left-diagonal
        int i=row;
        int j=col;
        while(i>=0&&j>=0){
            if(arr[i][j]==true) return false;
            i--;
            j--;
        }

        //right-diagonal
        i=row;
        j=col;
        while(i>=0&&j<arr.length){
            if(arr[i][j]==true) return false;
            i--;
            j++;
        }
        return true;
    }
    static void addArraytoList(boolean[][] arr){
        ArrayList<Integer>temp=new ArrayList<>();
        for(int i=0;i<arr.length;i++){


            for(int j=0;j<arr.length;j++){
                if(arr[i][j]){
                    temp.add(j+1);
                }
            }

        }
        list.add(temp);
    }
}
