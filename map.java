import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(10,"Ankur10");
        map.put(20,"Ankur20");
        map.put(30,"Ankur30");
        map.put(40,"Ankur40");
        map.put(50,"Ankur50");
        for (Map.Entry<Integer, String> entries : map.entrySet()) {
            entries.setValue(entries.getValue());
        }
        System.out.println(map);


    }
}
