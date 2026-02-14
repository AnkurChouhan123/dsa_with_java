import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
    int arr[]={5,9,3,8,1};
    mergesort(arr);
        System.out.println(Arrays.toString(arr));
//    mergesort(arr);
//    for(int i=0;i<arr.length;i++){
//        System.out.println(arr[i]);
//    }

}
//    static void divide(int arr[],int start,int end){
//        int mid=(start+end)/2;
//        if(start>=end){
//            return;
//        }
//        //left part
//        divide(arr, start, mid);
//        //right part
//        divide(arr, mid+1, end);
//        //merge
//        merge(arr,start,end);
//    }
//    static void merge(int arr[],int start,int end){
//        int mid=(start+end)/2;
//        int len1=mid-start+1;
//        int len2=end-mid;
//        int arr1[]=new int [len1];
//        int arr2[]=new int [len2];
//        int k=start;
//        for(int i=0;i<len1;i++){
//            arr1[i]=arr[k++];
//        }
//        for(int i=0;i<len2;i++){
//            arr2[i]=arr[k++];
//        }
//        k=start;
//        int i=0;
//        int j=0;
//        while(i<len1&&j<len2){
//            if(arr1[i]<arr2[j]){
//                arr[k++]=arr1[i++];
//            }
//            else{
//                arr[k++]=arr2[j++];
//            }
//        }
//        while(i<len1){
//            arr[k++]=arr1[i++];
//        }
//        while(j<len2){
//            arr[k++]=arr2[j++];
//        }
//
//
// }


   static void mergesort(int arr[]){

        if(arr.length<=1){
            return;
        }
        int mid=arr.length/2;
        int arr1[]= Arrays.copyOfRange(arr,0,mid);
        int arr2[]= Arrays.copyOfRange(arr,mid,arr.length);
        mergesort(arr1);
        mergesort(arr2);
        merge(arr,arr2,arr1);

   }
    static void merge(int arr[],int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
//        int newArray[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
//                i++;
            }
            else{
                arr[k++]=arr2[j++];
//                j++;
            }
        }
        while(i<m){
            arr[k++]=arr1[i++];
        }
        while(j<n){
            arr[k++]=arr2[j++];
        }


    }
}

