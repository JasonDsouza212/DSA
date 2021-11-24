public class findUniue {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,3,4,3,2,4,7};
        System.out.println(anss(arr));

    }

    public static int ans(int[] arr) {
        int num=0;
        for(int n : arr){
            num=num^n;
        }
        return num;
    }
    public static int anss(int[] arr) {
        int num=0;
        for(int n : arr){
            num=num^n;
        }
        return num;
    }

}
