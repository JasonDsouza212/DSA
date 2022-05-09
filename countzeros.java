public class countzeros {
    public static void main(String[] args) {
        System.out.println(count(1200200200));
    }
    static int count(int n){
        return  helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        if(n%10==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
class Solution {

    int numberOfSteps(int num) {
        return helper(num,0);

    }
    int helper(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
            helper(num/2,count+1);
        }
        return helper(num-1,count+1);
    }
};
