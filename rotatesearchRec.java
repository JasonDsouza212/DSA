public class rotatesearchRec {
    public static void main(String[] args) {
        int arr[]={5,6,7,8,1,2,3};
        System.out.println(rotate(arr,13,0,arr.length-1));
    }
    static int rotate(int arr[],int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==t){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(t>=arr[s]&&t<=arr[m]){
               return rotate(arr,t,s,m);
            }else{
               return rotate(arr,t,m+1,e);
            }
        }if(t>=arr[m]&&t<=arr[e]){
            return rotate(arr,t,m+1,e);
        }
        return rotate(arr,t,s,m-1);
    }
}
