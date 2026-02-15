package BinarySearch.OnAnswers;

public class PainterPartition {

    public int minTime(int[] arr, int k) {

        int sum = 0;
        for(int num:arr){
            sum += num;
        }

        int start = 0;
        int end = sum;

        int ans = -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(isPossible(arr,mid,k)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;

    }

    boolean isPossible(int[] arr, int val, int k){
        int painter = 1;
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > val) return false;
            sum += arr[i];
            if(sum>val){
                sum = arr[i];
                painter++;
            }

            if(painter>k) return false;

        }

        return true;
    }
    
}
