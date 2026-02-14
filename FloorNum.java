public class FloorNum {

    static int floorNumber(int arr[],int target){

        int start=0;
        int end=arr.length-1;
        int mid=start+(end-start)/2;

       if(target<arr[start]){
        return arr[end];
       }

        while(start<=end){
            if(arr[mid]==target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            mid=start+(end-start)/2;
        }
        return arr[end];

    }
    public static void main(String[] args) {
        int arr1[]={2,3,5,9,14,16,18};
        int arr2[]={2,3,5,8,14,16,18};
        System.out.println(floorNumber(arr1, 10));
        System.out.println(floorNumber(arr2, 17));
    }
}
