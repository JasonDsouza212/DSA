public class bitwiseOddEven {
    public static void main(String[] args) {
        int num=22;
        System.out.println(isodd(num));

    }
    static boolean isodd(int n){
        return (n & 1) == 1;
    }
}
