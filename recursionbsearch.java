public class recursionbsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,44,55,67,86};
        System.out.println(search(69,arr,0,arr.length-1));
    }
    static int search(int target,int arr[],int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return (search(target, arr, start, mid-1));
        }
        if(arr[mid]<target){
            return (search(target,arr,mid+1,end));
        }
        return -1;
    }
}
