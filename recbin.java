import java.util.Arrays;

public class recbin {
    public static void main(String[] args) {
//        index(5,0);
//        normalt(5,0);
        int arr[]={4,3,2,1};
//        System.out.println(recbb(arr,arr.length,0).);
        recbb(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }
    static void index(int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            System.out.print( "* ");
            index(r,c+1);


        }else{
            System.out.println("");
            index(r-1,0);
        }
    }
    static void normalt(int r,int c){
        if(r==0){
            return ;
        }
        if(c<r){
            normalt(r,c+1);
            System.out.print( "* ");


        }else{
            normalt(r-1,0);
            System.out.println("");
        }
    }
    static void recbb(int arr[],int r,int c){
        if(r==0){
            return  ;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            recbb(arr,r,c+1);
        }else {
            recbb(arr, r - 1, 0);
        }

    }
}
