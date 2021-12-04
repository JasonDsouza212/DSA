public class RangeXor {
    public static void main(String[] args) {
        int a=3;
        int b=9;
        System.out.println(range(b)^range(a-1));
    }
    static int range(int num){
        if(num%4==0){
            return num;
        }
        if(num%4==1){
            return 1;
        }
        if(num%4==2){
            return num+1;
        }
        return 0;

    }
}
