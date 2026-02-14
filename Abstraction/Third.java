package Abstraction;
abstract class Employee{
    abstract void calculateSalary();
    abstract void showInfo();
}

class Manager extends Employee{
    void calculateSalary(){
        System.out.println("1 lakh");
    }
    void showInfo(){
        System.out.println("you are a Manager");
    }
}
class Programmer extends Employee{
    void calculateSalary(){
        System.out.println("70k");
    }
    void showInfo(){
        System.out.println("you are a programmer");
    }
}

public class Third {
    public static void main(String[] args) {
        p.calculateSalary();
        m.calculateSalary();
        p.showInfo();
        m.showInfo();
    }
      static Programmer p=new Programmer();
      static  Manager m=new Manager();

}
