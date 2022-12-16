import java.util.*;
public class Hash {
    public static void main(String[] args){
//        HashMap <Integer, String> map = new HashMap<>();
//        map.put(100, "Vishal");
//        map.put(null, "Khawas");
//        System.out.println(map);

        Hashtable <String, Integer> table = new Hashtable<>();

        table.put("A", 1);
        table.put("B", 2);
        table.put("C", 3);
        table.put("D", 4);
        table.put("E", 5);

//        Set<String> keys = table.keySet();
//        for(String key: keys){
//            System.out.println("Rank:  " + table.get(key) + " Name: "+key);
//        }

        for (Map.Entry<String, Integer> e : table.entrySet())
            System.out.println("Rank: " + e.getValue() + " Name: " + e.getKey());

        System.out.println();

        TreeMap<String, Integer> tm = new TreeMap<String, Integer>(table);
        Set<String> keys = tm.keySet();
        Iterator<String> itr = keys.iterator();

        // traverse the TreeMap using iterator
        while (itr.hasNext()) {
            String i = itr.next();
            System.out.println("Rank: " + tm.get(i) + " Name: " + i);
        }
    }
}
