import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};//k=2 {4 5 1 2 3}  5 4 3 2 1   4 5 1 2 3
        int k=sc.nextInt();
        reverse(arr,k,0,arr.length-1);

        reverse(arr,k,0,k-1);
        reverse(arr,k,k,arr.length-1);
        for(int num:arr){
            System.out.print(num + " ");
        }

    }
   static void reverse(int arr[],int k,int i,int j){

      while(i<j){
          swap(arr,i,j);
          i++;
          j--;
      }
    }
   static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
