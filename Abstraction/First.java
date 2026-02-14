package Abstraction;

abstract class Animal{
   abstract void sound();
}
class Lion extends Animal{
    void sound(){
        System.out.println("gharrrrrr");
    }
}
class Donkey extends Animal{
    void sound(){
        System.out.println("Dhenchu Dhenchu");
    }
}

public class First {
    public static void main(String[] args) {
          Lion l=new Lion();
          Donkey d=new Donkey();
          l.sound();
          d.sound();


    }
}
