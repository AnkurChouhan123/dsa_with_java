public class ceilingNumber {
    static int ceilingNum(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

       if(target>arr[end]){
        return arr[start];
       }

        while(start<end){
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return arr[mid];
    }
    public static void main(String[] args) {
        int arr1[]={2,3,5,9,14,16,18};
        int arr2[]={2,3,5,8,14,16,18};
   System.out.println(ceilingNum(arr1,9 ));
   System.out.println(ceilingNum(arr2, 19));
    }
}
