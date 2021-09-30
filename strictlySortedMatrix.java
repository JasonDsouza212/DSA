import java.util.Arrays;

public class strictlySortedMatrix {
    public static void main(String[] args) {
    int matrix[][]={
            {1,3,5,7},
            {10,11,16,20},
            {23,30,34,50}
    };
        System.out.println(Arrays.toString(mid(matrix,7)));
    }
    static int[] binary(int target,int start,int end,int row,int arr[][]){
        int rstart=start;
        int rend=end;
        while(rstart<=rend){
            int mid=rstart+(rend-rstart)/2;
            if(arr[row][mid]==target){
                return new int[] {row,mid};
            }
            else if(arr[row][mid]<target){
                rstart=mid+1;
            }else{
                rend=mid-1;
            }
        }
        return new int[] {-1,-1};
    }
    static int[] mid(int arr[][],int target){
        int row=arr.length;
        int col=arr[0].length;
        if(col==0){
            return new int[] {-1,-1};
        }
        if(row==1){
            return binary(target,0,col-1,0,arr);
        }
        int mrows=0;
        int mrowe=row-1;
        int midcol=col/2;
        while(mrows<(mrowe-1)){
            int mid=mrows+(mrowe-mrows)/2;
            if(arr[mid][midcol]==target){
                return new int[] {mid,midcol};
            }else if(arr[mid][midcol]<target){
                mrows=mid;
            }else{
                mrowe=mid;
            }
        }
        if(arr[mrows][midcol]==target){
            return new int[] {mrowe,midcol};
        }
        if(arr[mrows+1][midcol]==target){
            return new int[] {mrowe+1,midcol};
        }
        if(target<arr[mrows][midcol]){
            return binary(target,0,midcol-1,mrows,arr);
        }
        if(target>arr[mrows][midcol]&&target<=arr[mrows][col-1]){
            return binary(target,midcol+1,col-1,mrows,arr);
        }
        if(target<arr[mrows+1][midcol]){
            return binary(target,0,midcol-1,mrows+1,arr);
        }else{
            return binary(target,midcol+1,col-1,mrows+1,arr);
        }
    }
}
