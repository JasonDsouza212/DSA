import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
         mergesortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr)+"knejwnenw");
    }
    static int[] mergeso(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] one=mergeso(Arrays.copyOfRange(arr,0, mid));
        int [] two=mergeso(Arrays.copyOfRange(arr,mid,arr.length));
        return combine(one,two);

    }
    static int[] combine(int o[],int t[]){
        int i=0;
        int j=0;
        int k=0;
        int neww[]=new int[o.length+t.length];
        while(i<o.length && j<t.length &&k<neww.length){
            if(o[i]<t[j]){
                neww[k]=o[i];
                i++;
            }else{
                neww[k]=t[j];
                j++;
            }
            k++;
        }
        while(i<o.length){
            neww[k]=o[i];
            i++;
            k++;
        }
        while(j<t.length){
            neww[k]=t[j];
            j++;
            k++;
        }
        return neww;
    }
    static void mergesortInplace(int arr[],int start,int end){
        if(end-start==1){
            return ;
        }
        int mid=(start+end)/2;
        mergesortInplace(arr,start,mid);
        mergesortInplace(arr,mid,end);

        combineInplace(arr,start,mid,end);

    }
    static void combineInplace(int[] arr,int s, int m, int e){
        int neww[]=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e &&k<neww.length){
            if(arr[i]<arr[j]){
                neww[k]=arr[i];
                i++;
            }else{
                neww[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            neww[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            neww[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<neww.length;l++){
            arr[s+l]=neww[l];
        }
    }
}
