public class isSorted {
    public static void main(String[] args) {
        int arr[]={1,2,6,5};
        System.out.println(isSort(arr, 0));

    }
    static boolean  isSort(int arr[],int index){
        if(index==(arr.length-1)){
            return true;
        }
        if(arr[index+1]<arr[index]){
            return false;
        }
        return isSort(arr, index+1);
    }
    
}
