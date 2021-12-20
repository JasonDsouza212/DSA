public class sqrt {
    public static void main(String[] args) {
            System.out.println(srtt(40,3));
    }
    static double srtt(int num ,int iter){
        int start=0;
        int end=num;
        int mid;
        double root=0.0;
        while (start<=end){
             mid=start+(end-start)/2;
            if(mid*mid==num){
                return mid;
            }
            if(mid*mid>num){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        double incr=0.1;
        for(int i=0;i<iter;i++){
            while (root*root<=num){
                root=root+incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
