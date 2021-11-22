public class findUniue {
    public static void main(String[] args) {
        int arr[]={2,3,4,3,2,4,7};
        System.out.println(ans(arr));

    }

    public static int ans(int[] arr) {
        int num=0;
        for(int n : arr){
            num=num^n;
        }
        return num;
    }
}
