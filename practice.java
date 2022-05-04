import java.util.*;

class practice {



    public static void main(String[] args){
        
        //narrowing conversion from wrapper to primitive
        Double d = 134343d;
        long l;
        l = (long)(double)d;
        System.out.println(l);
        l = (long)d.doubleValue();
        System.out.println(l);
        l = d.longValue();
        System.out.println(l);

    }

}