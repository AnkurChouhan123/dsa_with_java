

class A{

  final void finalM(){
        System.out.println("final method");
    }
    int finalM(int a){
       return 0;
    }

}



public class FinalKw {
    public static void main(String[] args) {
        A obj=new A();

        System.out.println( obj.finalM(10));
        obj.finalM();


    }
}
