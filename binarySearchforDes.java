public class binarySearchforDes {
    public static void main(String[] args) {
        int[] arr={9,8,7,6,5,4,3,2,1};
        int target=8;
        int ans=search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                end=mid-1;
            }else if(arr[mid]>target){
                start=mid+1;
            }

        }
        return  -1;
    }

}
