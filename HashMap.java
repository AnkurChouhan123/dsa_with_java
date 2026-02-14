import java.util.ArrayList;

class Pair{
    int key;
    int val;
    Pair next;
    Pair(int key,int val){
        this.key=key;
        this.val=val;
        next=null;
    }
}

public class HashMap {
    ArrayList<Integer>list=new ArrayList<>();
    Pair p;
    int capacity;
    int size;
    HashMap(){
       capacity=10;
       size=0;
    }

    static void put(int key,int val){
        if(HashMap.containsKey(key)){

        }
    }

   static boolean containsKey(int key){


        return false;

    }

    public static void main(String[] args) {

    }
}
