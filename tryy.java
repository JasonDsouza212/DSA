public class tryy {
    public static void main(String[] args) {
        int arr[] ={4,5,6,7,7,7,0,0,1,1,2};
        System.out.println(solution(arr, 1));
    }
    static  int solution(int arr[],int target){
        int pivot= findpeakwithdublicate(arr);
        if(pivot == -1){
            return  search(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(arr[0]<=target){
            int end=pivot-1;
            return  search(arr,target,0,pivot-1);
        }
        return search(arr,target,pivot+1,arr.length-1);
    }
    static  int findpeak(int arr[]){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start &&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
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
    static  int findpeakwithdublicate(int arr[]){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start &&arr[mid]<arr[mid-1]){
                return mid-1;
            }
           if(arr[mid]==arr[start] && arr[mid]==arr[end]){
               if(arr[start]>arr[start+1]){
                   return start;
               }
               start++;
               if(arr[end]<arr[end]-1){
                   return end-1;
               }
               end--;
           }
           else if (arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid] > arr[end])){
               start=mid+1;
           }else {
               end=mid-1;
           }
        }
        return -1;
    }
}
