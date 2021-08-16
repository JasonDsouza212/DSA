public class orderAgosticBS {
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,46};
        int target = 8;
        int ans = search(arr, target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
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
