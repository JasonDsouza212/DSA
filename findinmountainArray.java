public class findinmountainArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,56,23,5,4,3,2,1};
        int target=23;
        int peak=peak(arr);
        int ans=search(arr,target,0,peak);
        if(ans!=-1){
            System.out.println(ans);
        }else{
            ans=search(arr,target,peak+1,arr.length-1);
            System.out.println(ans);
        }
    }
    static  int peak(int arr[]){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }return start;
    }
    static int search(int[] arr, int target,int start,int end) {

        boolean isasc = arr[start] < arr[end];
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isasc) {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] >target) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
