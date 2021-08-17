public class floorOfaNumber {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,11,27,46};
        int target=1;
        int ans=search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        if(target<arr[arr.length-1]){
            return arr[0];
        }
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
        return  arr[end];
    }
}
