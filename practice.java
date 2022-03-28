import java.util.Collections;
import java.util.function.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.TreeMap;


class practice {



    public static void main(String[] args){
    /*    Scanner in = new Scanner(System.in);

        
        Map<Integer, String> m = new HashMap<>();
        System.out.println(m.get(1));
        m.put(1, "Yogesh");
        m.put(2, "meg");
        m.put(3, "kem");
        m.put(4, "thimm");
        m.put(5, "dumm");
        System.out.println(m.get(3));
        System.out.println(m.get(5));
        String k = m.put(5, "dummy");
        System.out.println(m.get(5));
        System.out.println(k);
        int x= 121;
        int n = x, rev =0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        System.out.println(rev);
        if(n==121) System.out.println("true");
        else System.out.println("false");       // these 2 lines can be replaced by one line i.e. return n==r

        Collection<Integer> c = new ArrayList<>();*/
       /*
        String s = Integer.toBinaryString(10);
        int c = 0;
        for(int i=0; i<s.length(); i++) if(s.charAt(i)==49) c++;
        System.out.println(c);
        
        Scanner in = new Scanner(System.in);
        Integer i = in.nextInt();
        int bn = Integer.parseInt(Integer.toBinaryString(i));
        System.out.println(bn);
        int pos = 1;
        int bmas = 1<<pos;
        System.out.println((bmas | 5) + "" + Integer.toBinaryString(103));
        

        HashMap<Integer,Character> a = new HashMap<>();
        Character ch = 'A';
        for(Integer i=1; i<=5; i++) a.put(i,ch++);
        a.put(6,null);
        System.out.println(a);
        System.out.println(a.putIfAbsent(6,'F') +""+a+""+a.putIfAbsent(6,'B') + "" + a);
        System.out.println(a.keySet() +""+ a.values() + a.entrySet());
        
        Scanner in = new Scanner(System.in);
        String L = in.nextLine();
        
        LinkedList<Character> ll = new LinkedList<>();
        char a[] = L.toCharArray();
        for(int i=0; i<a.length; i++) ll.add(a[i]);
        for(int i=1; i<ll.size(); i=i+2) ll.add(i,' ');
        System.out.println(ll.toString().replaceAll("[\\[\\]]", "").replaceAll(", ",""));
        */

        //System.out.println(Arrays.toString("Hello".split("")));

        /* 
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(1,2);
        tm.put(4,null);
        System.out.println(tm.merge(2, 2, (k,v) -> v*3)); //expecting addition of 2,2
        
        System.out.println(tm.merge(4, 5, (k,v) -> v));
        System.out.println(tm.merge(4, 6, (k,v) -> v));
        System.out.println(tm.compute(4, (k,v) -> v*6));
        System.out.println(tm.computeIfPresent(4, (k,v) -> v-6));
        tm.forEach((k,v) -> System.out.println(k +" "+ v));
        */

        TreeMap<Integer, String> a2 = new TreeMap<>();
        a2.put(1,"a");
        a2.put(2,null);

        //compute

        
        System.out.println(a2.compute(3, (k,v) -> "c") + a2); //not giving null its giving the result of func, if you replace c by null, it returns null
        System.out.println(a2.compute(2, (k,v) -> "d") + a2); //gives d
        System.out.println(a2.compute(1, (k,v) -> null) + a2); //gives null not a, if v.concat("b") given it returns ab, not a
        

        //means, whatever the condition might be it gives the result of BiFunction in all condition.

        //computeIfAbsent

        System.out.println(a2.computeIfAbsent(3, k -> String.valueOf(k*2)) + a2); //returns value of Function, for k-non null value pair it returns null

        //computeIfPresent

        System.out.println(a2.computeIfPresent(1, (k,v) -> (v+"b")) + a2);

        //merge

        System.out.println(a2.merge(4, "d", (k,v) -> v.concat("e")) + a2); //when k not exist it puts 1st & 2nd arguments skips 3rd and returns the 2nd argu here its "d" 
        System.out.println(a2.merge(2, "b", (k,v) -> v.concat("c")) + a2); //when k present & mapped to null, happens same as above
        System.out.println(a2.merge(2, "c", (k,v) -> v.concat("d")) + a2); //when both present, (k,v) takes what you give i.e 2, "c", not whats there 2, "b", performs some action puts that value to the specified key & returns the same
        




        

    }

}