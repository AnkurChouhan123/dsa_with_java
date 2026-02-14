public class AbstractClassAndMethod {

    public static void main(String[] args) {
        Car c=new Car();
        System.out.println(c.getNoOfWheels());
        System.out.println(new Auto().getNoOfWheels());
        System.out.println(new Auto().getType());
    }

}
abstract class Vehicle{
    public  int getNoOfWheels(){
        return 0;
    }
    public abstract String getType();
}
class Car{
    public int getNoOfWheels(){
        return 4;
    }
    public String getType(){
        return "4 Wheeler";
    }
}
class Bike{
    public int getNoOfWheels(){
        return 2;
    }
    public String getType(){
        return "2 Wheeler";
    }
}
class Auto{
    public int getNoOfWheels(){
        return 3;
    }
    public String getType(){
        return "Tirrrriiiiii";
    }
}
