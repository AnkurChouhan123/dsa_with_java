package CollectionFramework.Comperator;

import java.util.Comparator;
import java.util.TreeSet;

class Comperator1 implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2) {
            return +1;
        }
        if (i1 > i2) {
            return -1;
        }

        return 0;
    }


}

public class decreaseSort {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new Comperator1());
        set.add(10);
        set.add(0);
        set.add(15);
        set.add(5);
        set.add(20);
        set.add(20);
        System.out.println(set);

    }
}
