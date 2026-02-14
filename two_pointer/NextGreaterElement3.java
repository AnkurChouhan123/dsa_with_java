package two_pointer;

public class NextGreaterElement3 {

    public static void main(String[] args) {
        int n=321;
        System.out.println(nextPermutation(n));
    }

    static void convertToArray(int n, int[] arr){
        int len=(n+"").length();
        int i=len-1;

        while(n>0&&i>=0) {
            int digit = n % 10;
            arr[i] = digit;
            n /= 10;
            i--;
        }
    }

    static int nextPermutation(int n){
        int len = (n+"").length();
        int[] arr = new int[len];
        convertToArray(n,arr);
        int bp=breakingPoint(arr);
        if(bp==-1) return -1;
        reverse(arr,bp,len-1);

        int k=bp-1;
        swap(arr,bp,k);

        int ans=0;

        for(int i=0;i<len;i++){
           ans=arr[i]+ans*10;
        }

        return ans;

    }

    static int breakingPoint(int[] arr){

        int bp=-1;
        for(int i=arr.length-1;i>0;i--){

            if(arr[i-1]<arr[i]){
                bp=i;
                break;
            }

        }
        return bp;
    }

    static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
