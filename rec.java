public class rec {
    public static void main(String[] args) {
//        rec1(5);
//        System.out.println( fact(5));
//        System.out.println( sum(5));
//        System.out.println( sd(54115));
//        System.out.println(pd(23));
        System.out.println(rev1(123));

    }
    static void rec1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        rec1(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
    }
    static int sum(int n){
        if(n==1){
            return n;
        }
        return n+sum(n-1);
    }
    static int sd(int n){
        if(n%10 == n){
            return n;
        }
        return n%10+sd(n/10);
    }
    static int pd(int n){
//        if(n%10==0){
//            return 1;
//        }
        if(n%10==n){
            return n;
        }
        return n%10*sd(n/10);
    }
    static String ans;
   static int rev1(int n){
       if(n%10==n){
           return n;
       }
       return (n%10)*10+rev1(n-1);
   }
}
