//package Multithreading;
//
//import static java.lang.Thread.sleep;
//
//class Test1 extends Thread{
//    public void run(){
//        try{

/// /        for(int i=1;i<=5;i++){
/// /           // Thread.sleep(1000);
/// /            System.out.print(i+" ");
/// /        }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//class Test2 extends Thread{
//    public void run(){
//        try{
//            for(int i=10;i<=50;i++){
//                sleep(1000);
//                System.out.print(i+" ");
//                i+=9;
//            }
//            System.out.println();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
//public class SleepMethod {
//    public static void main(String[] args) {
//        try{
//            sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//        }
//        Test1 t1=new Test1();
//        t1.start();
//
//    }
//}

