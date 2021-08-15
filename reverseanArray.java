import  java.util.Arrays;
public class reverseanArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
        reverse(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int sindex,int endindex){
        int temp=arr[endindex];
        arr[endindex]=arr[sindex];
        arr[sindex]=temp;
    }
}
