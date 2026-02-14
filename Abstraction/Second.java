package Abstraction;
abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();


}
 class Circle extends Shape{
    int r;
    Circle(int radius){
        this.r=radius;
    }
    double calculateArea(){
        return 3.14*r*r;
    }
    double calculatePerimeter(){
        return 2*3.14*r;
    }
}
class Triangle extends Shape{
    int base,height,hypo;
    Triangle(int base,int height,int hypo){
        this.base=base;
        this.height=height;
        this.hypo=hypo;
    }
    double calculateArea(){
        return 0.5*base*height;
    }
    double calculatePerimeter(){
        return base+height+hypo;
    }
}
public class Second {
    public static void main(String[] args) {
        Circle c=new Circle(3);
        Triangle t=new Triangle(2,3,4);
        System.out.println(c.calculateArea());
        System.out.println(c.calculatePerimeter());
        System.out.println(t.calculateArea());
        System.out.println(t.calculatePerimeter());

    }
}
