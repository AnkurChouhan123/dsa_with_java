package ExceptionHandling.ThrowKeyword;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class DuplicateExceptionFound extends RuntimeException {
    DuplicateExceptionFound(String msg) {
        super(msg);
    }
}


public class CheckDuplicateException {
    int size;
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list;
    HashMap<Integer, Integer> map;

    public CheckDuplicateException(int size) {
        this.size = size;
        list = new ArrayList<>(this.size);
        map = new HashMap<>();
    }

    void createList() {
        System.out.println("enter first data");
        list.add(sc.nextInt());
        for (int i = 1; i < size; i++) {
            System.out.println("enter next data");
            list.add(sc.nextInt());
        }
        for (int i = 0; i < size; i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i)) + 1);
            } else {
                map.put(list.get(i), 1);
            }
        }
    }

    void checkDuplicate() {
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                throw new DuplicateExceptionFound("duplicate data found , integer : " + key);
            }
        }
    }


    public static void main(String[] args) {
       CheckDuplicateException list=new CheckDuplicateException(6);
       list.createList();
       list.checkDuplicate();
    }
}
