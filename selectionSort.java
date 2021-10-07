import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        System.out.println(Arrays.toString(selection(arr)) );
    }
    static int[] selection(int[] arr){
        for(int i=0;i<arr.length;i++){
          int min=arr[i];
          int minindex=i;
           for(int j=i+1;j<arr.length;j++){
               if(min>arr[j]){
                   min=arr[j];
                   minindex=j;
               }
           }
           int temp=arr[minindex];
           arr[minindex]=arr[i];
           arr[i]=min;
        }
        return arr;
    }
}
