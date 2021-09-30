import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1,100};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            boolean swapped=false;
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break;
            }
        }
        return arr;
    }
}
