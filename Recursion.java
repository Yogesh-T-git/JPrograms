public class Recursion {

 
    static void fibo(int a, int b, int n){      //FIBONACCHI
        /*
        if(n == 1) {
            System.out.println(0);   *)itara kododrinda, sice everytime it calculates series for n, both -> fib(n-1) & fib(n-2) 
            return 0;                 leads to n == 1 & n==2 which prints 0 1 for several times for the same number means if 
        }                             you want fibo series of 4, which branches to fibo(3) & fib(2) where fib(3) prints 0&1 
        if(n == 2) {                  and for fib(2) 1 will be again printed, so to avoid this print 0 and 1 once 
            System.out.println(1);    since its common for all nth terms.
            return 1;               *)to keep a counter i, change like this if(i == n) return; i++; fibo(b,c,n,i); int n = 5, i = 0; 
        }                             fibo(a,b,n-2,i); static void fibo(int a, int b, int n, int i){}
        System.out.println(fibo(n-1)+ fibo(n-2));

        static int fibo(int n){
            if(n == 1) System.out.println(0);    *)to directly get the nth term of fibonacchi series 
            if(n == 2) System.out.println(1);    fibo(n) -> in main function
            return fibo(n-1) + fibo(n-2);
        }
        */
        
        if(n == 0) return;
        int c = a+b;
        System.out.print(c+" ");
        fibo(b,c,n-1);

    }

    static int px(int x, int n){        //POWEROFX
        
        //if(x==0) return 0; //when x=0
        //if(n==0) return 1; //when n=0 
        //return x*px(x,n-1); 

        if(n==1) return x;   // use this when you dont want to given x/n as 0
        return x*px(x,n-1);

        //if(x==0) return 0;
        //if(n==0) return 1;
        //if(n%2==0) return px(x,n/2)*px(x,n/2);   use this expression to increase performance by lowering 
        //else return px(x,n/2)*px(x,n/2)*x;       the stack height (logn), see recursion playlist of aman apni kaksha

    }

    static void toh(int n, char s, char d, char a){     //tower of bramha
        if(n==1) {
            System.out.println("Move disk "+n+" from "+s+"to "+d);
            return;
        }                                               // time complexity O(2^n-1) ~ O(2^n) YT-ak PL - recursion 2nd video
        toh(n-1,s,a,d);
        System.out.println("Move disk "+n+" from "+s+"to "+d);
        toh(n-1,a,d,s);
    }

    static void Strev(String s, int idx){       //reversing a string 
        if(idx < 0 ) return;
        //if(idx==1){Syso(s.charAt(idx)); return;} u can replace upper if by this if 
        System.out.print(s.charAt(idx--));      //time complexity O(n) n = s.length();
        Strev(s,idx);

    }

    static void Stirng(String s, char ch, int i, int f, int l){
        if(i==s.length()-1) return;
        if(ch==s.charAt(i)){
            if(f>=i){
                f = i;
                System.out.println("\nfirst index "+ f);
            }else{
                
                if(l < i){
                    l = i;
                    System.out.println("Last index "+ l);
                }
            }
        }
        Stirng(s,ch,++i,f,l);

    }

    

    public static void main(String[] args){

        //fibo series 
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        int n = 5;
        fibo(a,b,n-2);  

        System.out.println("\n"+px(2,3));

        toh(1,'A','B','C');

        Strev("Yogesh", "Yogesh".length()-1);

        Stirng("abaacdaefaah",'a',0,0,-1);



        

        

    }
    
}
