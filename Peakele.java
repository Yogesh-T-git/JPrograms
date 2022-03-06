import java.util.*;
public class Peakele {

    public static void main(String[] args){
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

        
    }
}
