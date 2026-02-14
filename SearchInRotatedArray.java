public class SearchInRotatedArray {
    public static void main(String[] args) {
        int arr[]={4,5,1,2,3,3};
      //  System.out.println(pivot(arr, 0, arr.length-1));
      System.out.println(search(arr, 0, arr.length-1, 3));
    }
    static int pivot(int arr[],int s,int e){
        int mid=(s+e)/2;
        if(s==e)
            return s;
        
        if (arr[mid]>=arr[0]) {
            return pivot(arr, mid+1, e);
            
        }
            return pivot(arr, s, mid);
    }
    static int search(int arr[],int s,int e,int target){
        int mid=(s+e)/2;
        int ans=pivot(arr,0,arr.length);
        if(target>arr[ans]&&target>arr[0]){
            return search(arr, s, ans-1, target);
        }
        else if (target>arr[ans]&&target<arr[0]) {
            return search(arr, ans, e, target);
        }
        if(arr[mid]==target){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr, mid+1, e, target);
        }
        return search(arr, s, mid-1, target);
     
    }
}
