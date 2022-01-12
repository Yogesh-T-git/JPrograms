import java.util.*;

class practice{


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
        */

        HashMap<Integer,Character> a = new HashMap<>();
        Character ch = 'A';
        for(Integer i=1; i<=5; i++) a.put(i,ch++);
        a.put(6,null);
        System.out.println(a);
        System.out.println(a.putIfAbsent(6,'F') +""+a+""+a.putIfAbsent(6,'B') + "" + a);
        System.out.println(a.keySet() +""+ a.values() + a.entrySet());
        
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i=1; i<=5; i++) tm.put(i,i);
        System.out.println(tm.floorEntry(1));
        Map.Entry<Integer, Integer> kkk = tm.floorEntry(1);
        System.out.println(kkk.getKey());
 
        

        
        
        
        
        

        
        
        
        
        
        


        
        
        
        
    



        

 
    

        

       
    }
}