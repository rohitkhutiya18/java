public class SearchRotateSortArr {
    static int search(int[] arr, int target) {
        int ans = -1;
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[st] <= arr[mid]) {
                if (arr[mid] > target && arr[st] <= target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            } else {
                if (arr[mid] > target && arr[end] <= target) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 1, 2, 3 };
        System.out.println(search(arr, 5));
    }
}
