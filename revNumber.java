public class revNumber {
    public static void main(String[] args) {
        int n=182;
        System.out.println(rev(n, 0));
       
    }
    static int rev(int n,int ans){
        if(n==0){
            return ans;
        }

     return rev(n/10,n%10+ans*10);
    }
    
}
