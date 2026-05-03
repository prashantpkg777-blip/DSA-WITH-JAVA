package JavaCollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    static void main() {

        Map<String, String> map1 = new HashMap<>();

        // Insertion
        map1.put("in","India");
        map1.put("us","USA");
//        map1.put("in","India2");
        map1.put("uk","United Kingdom");

        System.out.println(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("br","Brazil");
        map2.put("fr","France");

        System.out.println("After: "+ map2);
        map2.putAll(map1);
        System.out.println("Before: "+ map2);

        // Delection
        map2.remove("uk");
        System.out.println(map2);
        System.out.println(map2.size());

//        map2.clear();
//        System.out.println(map2.size()); // 0

        map2.putIfAbsent("ind","India3");
        System.out.println(map2);

        // get
        System.out.println(map2.get("ind"));

        System.out.println(map2.getOrDefault("eng","none"));

        // contains
        System.out.println(map2.containsKey("eng")); // false
        System.out.println(map2.containsValue("India")); // true

        // replace
        System.out.println(map2);
        map2.replace("in","Indonesia");
        System.out.println(map2);

        map2.replace("us","USA","United States of America");
        System.out.println(map2);

        // key and values and also entries

        System.out.println("Keys: "+map2.keySet()); // in sets
        System.out.println("Values: "+map2.values()); // in collections
        // get all the entries from map
        System.out.println("Entry: "+ map2.entrySet()); // in sets

        // iterator
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println("Key: "+entry.getKey() + " -> Value: " + entry.getValue());
        }



    }
}
