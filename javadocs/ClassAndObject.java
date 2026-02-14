public class ClassAndObject {
    public static void main(String[] args) {
        Bicycle b1=new Bicycle();
        Bicycle b2=new Bicycle();
        b1.changeGear(5);
        b1.increaseSpeed(9);
        b1.increaseSpeed(13);
        b1.decreaseSpeed(6);
        b1.display();
        b2.changeGear(3);
        b2.increaseSpeed(7);
        b2.increaseSpeed(11);
        b2.decreaseSpeed(6);
        b2.display();
    }
}
class Bicycle{
    int speed=0;
    int gear=1;
    void changeGear(int n){
        gear=n;
    }
    void increaseSpeed(int n){
        speed+=n;
    }
    void decreaseSpeed(int n){
        speed-=n;
    }
    void display(){
        System.out.println("speed : "+speed);
        System.out.println("gear : "+gear);
    }
}
