public class linearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,1,4};
        int element=5;
        System.out.println("the element is present at"+ search(arr,element));
    }
    static  int search(int[] arr,int ele){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                return i;
            }
        }
        return -1;
    }
}
