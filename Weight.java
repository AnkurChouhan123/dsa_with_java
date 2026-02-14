public class Weight {

    static void maxWeight(int arr[],int n ){
        
        int p1=arr[0];
        int p2=arr[n-1];
        int start=1;
        int end=n-2;

      while(start<end){
      if(p2<p1){
        p2+=arr[end--];
      }
      else if (p1<p2) {
        p1+=arr[start++];
      }
      }
      System.out.println(p1);
      System.out.println(p2);
    }
    public static void main(String[] args) {
        int arr[]={3, 1, 4, 1 ,5, 9 ,2, 6, 5, 3 ,5};
        maxWeight(arr, 11);
    }
}
