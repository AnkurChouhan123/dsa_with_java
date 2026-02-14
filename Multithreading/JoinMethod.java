package Multithreading;//package Multithreading;

//
//
//class Testt extends Thread{
//    Thread mainThread;
//    Testt(Thread mainThread){
//        this.mainThread=mainThread;
//    }
//    public void run(){
//        try{
//            mainThread.join();
//            for(int i=1;i<=5;i++) {
//                Thread.sleep(1000);
//                System.out.println("Child Thread " + i);
//            }
//        }
//        catch(InterruptedException e){
//            // System.out.println(e);
//        }
//    }
//}
//public class JoinMethod {
//
//    public static void main(String[] args) {
//        Thread mainThread=Thread.currentThread();
//        Testt t=new Testt(mainThread);
//        t.start();
//
//        try{
//           t.join();
//        for(int i=1;i<=5;i++) {
//            Thread.sleep(1000);
//            System.out.println("main " + i);
//        }
//        }
//        catch(InterruptedException e){
//           // System.out.println(e);
//        }
//    }
//}

///-------------------------------------------------------------------------------------------///


class A extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("class A");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class B extends Thread {
    Thread a;
    B(Thread a){
        this.a=a;
    }

    public void run() {

        try {
            a.join();
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("class B");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class C extends Thread {
    Thread b;
    C(Thread b){
        this.b=b;
    }

    public void run() {
        try {
            b.join();
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("class C");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        C c = new C(b);
        a.start();
        b.start();
        c.start();

    }
}
