package Abstraction;

import java.util.Arrays;
import java.util.Scanner;

abstract class Shape2D{
    abstract void draw();
    abstract void resize();

}
class Rectangle extends Shape2D{
    int l,w;
   public Rectangle(int l,int w){
        this.l=l;
        this.w=w;
    }
    void draw(){
       for(int i=0;i<w;i++){
           System.out.print("* ");
       }
        System.out.println();
        for(int i=0;i<l-2;i++){
            System.out.print("* ");
            for(int j=0;j<w-2;j++){
                System.out.print("  ") ;
            }
            System.out.print("* ");
            System.out.println();
        }
        for(int i=0;i<w;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
    void resize(){
       Scanner sc= new Scanner(System.in);
        System.out.println("enter new width");
        w= sc.nextInt();
        System.out.println("enter new length");
        l=sc.nextInt();
    }
}
class Circle2 extends Shape2D{
    int radius;

    public Circle2(int r){
         this.radius=r;
    }
    public void draw() {
        char[][] mat=new char[radius*2][radius*2];
       //Arrays.fill(mat,' ');
      //  System.out.println("*");
        int mid=mat.length/2;
        for(int i=0;i<mat.length/2;i++) {
            mat[i][mid - i] = '*';
            mat[i][mid + i] = '*';
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;i<mat.length;i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }


    }
    void resize(){

    }
}

public class Fourth {
    public static void main(String[] args) {
            Rectangle r=new Rectangle(4,8);
//            r.draw();
//            r.resize();
//            r.draw();
//            r.draw();
            Circle2 c=new Circle2(8);
            c.draw();
    }
}
