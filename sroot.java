public class sroot {
    public static void main(String[] args) {
        int num=40;
        int presision=3;
        System.out.println(root(num,presision));
    }

    private static double root(int num, int presision) {
        int start=0;
        int end=num;
        double root=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==num){
                return mid;
            }
            else if(mid*mid>num){
                end=mid-1;

            }else{
                start=mid+1;
                root=mid;
            }
        }
        double p=0.1;
        for(int i=0;i<presision;i++){
            while (root*root<=num){
                root=root+p;
            }
            root=root-p;
            p=p/10;
        }
        return root;
    }
}
