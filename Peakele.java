import java.util.*;
public class Peakele {

    public static void helloprint(){
        System.out.println("hello");
    }

    public static void main(String[] args){

        /*
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.forEach(e -> System.out.println(e));

        ArrayList<Integer> b = new ArrayList<>(Collections.nCopies(5,-1));
        System.out.println(b);
        b.add(01);
        b.add(02);
        b.add(03);
        b.forEach(e -> System.out.println(e));

        */
        /*
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Aman");
        map.put("Address", "Kolkata");
        
  
        // Print the map
        System.out.println("Map: " + map);
  
        // remap the values using compute() method
        map.compute("Name", (a, b)
                                -> b.concat(" Singh"));
        map.compute("Address", (key, val)
                                   -> val.concat(" West-Bengal"));
  
        // print new mapping
        System.out.println("New Map: " + map);

        map.merge("Yogesh", "Gowda", (a,b) -> b.concat(b));
        System.out.println(map);                // expected : Yogesh=Gowda
        map.merge("Yogesh", "Great", (a,b) -> null);
        System.out.println(map);                // expected: Yogesh=null 
        map.merge("Yogesh", "GreatGowda", (a,b) -> null);
        System.out.println(map);                //expected: Yogesh=GreatGowda
        map.put("hello", null);
        System.out.println(map.get("hello"));

        

        List<Integer> ar = Collections.nCopies(5,-1);
        
        List<Integer> arlist = new ArrayList<>(Collections.nCopies(5,-1));
        arlist.add(1);
        arlist.add(2);
        arlist.add(3);
        arlist.add(4);
        
        int[] a = new int[5];

        ArrayList<Integer> dummy = new ArrayList<>();

        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(1,1);
        tm.put(2,2);
        tm.put(3,3);
        tm.put(4,4);
        tm.forEach((c,d)-> System.out.print(c +"-"+d + " "));
        int dum = tm.computeIfAbsent(4, k -> null);
        tm.forEach((c,d) -> System.out.println(c+""+d+" "));

        Map.Entry<Integer,Integer> me = tm.firstEntry();
        System.out.println(me.getKey());

        */
        StringBuilder sb = new StringBuilder("ABCD");
        System.out.println(new String("ABCD").equals(sb));

        
    }
}
