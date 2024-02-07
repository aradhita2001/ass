package CollectionsDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(12, 12);
        map.put("args", "map");
        map.put(null, "map");
        map.put(12, 144);
        map.put(null, null);
        map.remove(null);
        map.put(11,121);

        Set keys = map.keySet();
        System.out.println(keys);

        List values =new ArrayList (map.values());
        for(Object value : values){
            System.out.println(value);
        }
        System.out.println(map);

        Set entrySet = map.entrySet();
        
        Iterator itr = entrySet.iterator();

        while(itr.hasNext()){
            Map.Entry me =  (Map.Entry) itr.next();

            System.out.println(me.getKey() + "   " + me.getValue());
        }
    }
}
