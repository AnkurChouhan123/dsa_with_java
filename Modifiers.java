   class Modifiers {
       public static void main(String[] args) {
          Test2 obj=new Test2();
          obj.display();

   }
}
  class Test1{

    protected void display(){
        System.out.println("Test 1");
    }

}
class Test2 extends Test1{

//       void display(){
//        System.out.println("Test 2");
//    }

}
