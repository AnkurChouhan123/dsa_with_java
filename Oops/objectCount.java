package Oops;

public class objectCount {
   static int count=0;
    {
        count++;
    }
    objectCount(){

    }
    objectCount(int a){

    }
    objectCount(String m){

    }
    void print(){
        System.out.println("method");
    }
    public static void main(String[] args) {

       new objectCount();
       new objectCount(1);
       new objectCount();
       new objectCount();
       new objectCount(1);
      objectCount obj= new objectCount();
      obj.print();


        System.out.println(count);

    }
}
