public class rec {
    public static void main(String[] args) {
//        rec1(5);
//        System.out.println( fact(5));
//        System.out.println( sum(5));
//        System.out.println( sd(54115));
//        System.out.println(pd(23));
//          rev1(123);
//        System.out.println(sum);
//        System.out.println(rev2(1234));
        System.out.println(palindrome(121));
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
    static int sum=0;
   static void rev1(int n){
       if(n==0){
           return ;
       }
       int rem=n%10;
       sum=sum*10+rem;
       rev1(n/10);
   }
   static int rev2(int n){
       int digits=(int)(Math.log10(n)+1);
       return helper(n,digits);
   }

    private static int helper(int n, int digits) {
       if(n%10==n){
           return n;
       }
       return n%10*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
    static boolean palindrome(int n){
       if(n==rev2(n)){
           return true;
       }
       return false;
    }
}
