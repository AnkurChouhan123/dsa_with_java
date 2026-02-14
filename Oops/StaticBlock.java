package Oops;
class A2{
    static{
        System.out.println("hello");
    }
   static {
        int x=10;
        System.out.println(x);
    }
}

public class StaticBlock extends A2 {
    static{
        System.out.println("main");
    }
    public static void main(String[] args) {
        StaticBlock obj1=new StaticBlock();

        // A2 obj=new A2();
    }
    static{
        System.out.println("main 2");
    }
}
