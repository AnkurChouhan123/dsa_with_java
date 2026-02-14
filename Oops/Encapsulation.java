package Oops;
class Employee{
    private int empid;
    void setId(int id){
        empid=id;
    }
    int getId(){
       // System.out.println(empid);
        return empid;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Employee e=new Employee();
        e.setId(312752);
        e.setId(12);
        e.setId(14);
        System.out.println(e.getId());
    }
}
