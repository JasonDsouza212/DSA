public class rangePrime {
    public static void main(String[] args) {
        int num=40;
        boolean arr[]=new boolean[num+1];
        range(arr,num);
    }
    static void range(boolean arr[],int num){
        for(int i=2;i*i<num;i++){
            if(!arr[i]){
                for(int j=i*2;j<=num;j+=i){
                    arr[j]=true;
                }
            }
        }
        for(int i=2;i<=num;i++){
            if(!arr[i]){
                System.out.print(i+ " ");
            }
        }
    }
}
