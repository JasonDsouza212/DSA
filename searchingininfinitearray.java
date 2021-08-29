public class searchingininfinitearray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,29,45,50};
       int ans= position(arr,29);
        System.out.println(ans);

    }
    static int position(int arr[],int target){
        int start=0;
        int end=1;
        int count=2;
        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
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
