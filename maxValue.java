public class maxValue {
    public static void main(String[] args) {
        int arr[]={3,44,32,43,53,34,23,23,45,89};
        System.out.println("the max value in the array is "+max(arr));
    }
    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
