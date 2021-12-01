public class setBits {
    public static void main(String[] args) {
        int n=234567;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(count(n));
    }
    static int count(int num){
        int count=0;
        while(num>0){
            int ans=num&1;
            if(ans==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}
