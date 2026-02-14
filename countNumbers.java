public class countNumbers {
    public static void main(String[] args) {
        System.out.println(count(10700, 0));
        
    }
    static int count(int n,int counts){
        if(n==0)
            return counts;
        
        if(n%10==0){
            counts++;
        }
       return count(n/10, counts);

    }
    
}
