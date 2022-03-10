public class lcmgcd {
    public static void main(String[] args) {
        System.out.println(gcd(9,18));
        System.out.println(lcm(3,27));
    }
    static int gcd(int n,int n2){
        if(n==0){
            return n2;
        }
        return  gcd(n%n2,n);
    }
    static int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
}
