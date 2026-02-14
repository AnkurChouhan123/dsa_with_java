

public class Liftprblm {
    public static void main(String[] args) {

    }
    int function(int a,int b){
        if(b>a){
            function(b,a);
        }
        return a-b;
    }
}
