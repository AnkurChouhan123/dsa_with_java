package Interfacee;

interface interf{
    void sound();
    void display();
}
abstract class A implements interf{
    public void sound(){
        System.out.println("sound is heard");
    }
//    public void display(){
//        System.out.println("Display is on");
//    }
}
class B extends A{
    public void display(){
        System.out.println("Display is on");
    }
}
public class First {
    public static void main(String[] args) {
        B obj =new B();
        obj.sound();
        obj.display();
    }
}
