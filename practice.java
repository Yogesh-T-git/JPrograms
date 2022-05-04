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

        //cast from double to Long
        double d1 = 34;
        Long  l1 = (long)d1; //cast it to primitive long and assign to Long. Auto-boxing will take care after that 

        /**
         * For cast from Double to byte/short/int/long/double we have .byte/short/int/long/doubleValue() method.
         * For laborious one see down
         */

        l = (long)(double)d;

    }

}