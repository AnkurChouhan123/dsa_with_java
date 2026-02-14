package CollectionFramework.Comperator;

import java.util.Comparator;
import java.util.TreeSet;

class Comperator2 implements Comparator {

    public int compare(Object obj1, Object obj2) {

        String s1 = obj1.toString();
        String s2 = obj2.toString();
//        Integer len1=s1.length();
//        Integer len2=s2.length();
//        return s1.length().compareTo(s2.length());
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 < len2) {
            return -1;
        }
        if (len1 > len2) {
            return +1;
        }
        else return s1.compareTo(s2);
    }

}

public class StringAndStringBufferSort {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new Comperator2());
        t.add("A");
        t.add(new StringBuffer("Abc"));
        t.add(new StringBuffer("AA"));
        t.add("xx");
        t.add("ABCD");
        t.add("A");
      //  t.add("t");
        System.out.println(t);
    }
}
