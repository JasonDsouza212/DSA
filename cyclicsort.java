import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,4};
        int arr2[]={5,4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(othertype(arr2)));
        
    }
    static int[] sort(int arr[]){
        int i=0;
        while(i<arr.length){
            if(arr[i] == i+1){
                i++;
            }else{
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
    }
    static int[] othertype(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap( arr,i,correct);
            }else{
                i++;
            }
        }
        return arr;
    }
    static int[] swap(int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return arr;
    }

}
