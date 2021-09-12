import java.util.Arrays;

public class rowcolMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {10,20,0,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(matrix(arr, 37)));
    }
    static int[] matrix(int[][] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<arr.length&& end>=0){
            if(arr[start][end]==target){
                return new int[] {start,end};
            }
            else if(arr[start][end]<target){
                start++;
            }else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
