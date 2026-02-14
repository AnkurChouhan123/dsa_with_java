package CollectionFramework;

import java.util.ArrayList;

public class PenImplementation {
    public static void main(String[] args) {
        MyPens pen1=new MyPens("cello","blue",5);
        MyPens pen2=new MyPens("doms","black",10);
        MyPens pen3=new MyPens("montex","red",15);
        ArrayList<MyPens>list=new ArrayList<>();
        list.add(pen1);
        list.add(pen2);
        list.add(pen3);
        System.out.println(list);
    }
}
