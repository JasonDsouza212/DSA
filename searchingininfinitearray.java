public class searchingininfinitearray {
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
       int ans= position(arr,170);
        System.out.println(ans);
    }
    static int position(int arr[],int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
                int temp=end+1;
                end=end+(end-start+1)*2;
                if(end>arr.length-1){
                    end= arr.length-1;
                    break;
                }
                start=temp;
        }
        int ans=search(arr,target,start,end);
        return  ans;
    }
    static int search(int[] arr, int target,int start,int end){

        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }

        }
        return  -1;
    }
}