public class powerofTwo {
    public static void main(String[] args) {
        System.out.println(ans(0));
        
    }
    static boolean ans(int n){
        if(n==0){
            return false;
        }
        while(n!=0){
            if(n==1){
                return true;
            }
            if(n%2==1){
                return false;
            }
            else{
                n=n/2;
            }
        }
        return true;
    }
    
}
