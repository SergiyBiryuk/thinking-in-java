package task_17;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import task_1.Gerbil;

public class GerbilMap {
    public static void main(String[] args) {
        Map<String, Gerbil> map = new HashMap<String, Gerbil>();
        for(int i = 0; i < 20; i++)
            map.put("Gerbil-" + i, new Gerbil(i));
        for(Iterator<String> it = map.keySet().iterator(); it.hasNext();) {
            String key = it.next();
            System.out.print(key + ": ");
            map.get(key).hop();
        }
    }
}
