package Oops;
//
//class A{
//    static int a = 10;
//    A(int a){
//        A.a = a;
//    }
//    void show(){
//        System.out.println(a);
//    }
//
//}
//
//public class StaticVariable {
//
//    public static void main(String[] args) {
//        StaticVariable obj1=new StaticVariable();
//        A ob1=new A(25);
//        A ob2=new A(35);
//        ob1.show();
//
//
//        //System.out.println(obj2.a);
//
//
//
//
//        System.out.println();
//
//    }
//}
class A{
    static int x=12;
//    int returnX(int x){
//        A.x=x;
//        return x;
//    }
}

class StaticVariable extends A{
    public static void main(String[] args) {

        System.out.println(x);

//        A obj1=new A();
//        System.out.println(obj1.x);
//        obj1.returnX(30);
//        System.out.println(A.x);

    }
}
