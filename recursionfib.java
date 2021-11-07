public class recursionfib {
    public static void main(String[] args) {
        System.out.println(num(4));
    }
    static int num(int n){
        if(n<2){
            return n;
        }
        return num(n-1)+num(n-2);
    }
}
