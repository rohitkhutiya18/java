public class FristLastPos {
    static int lowerbound(int[] arr, int target) {
        int ans = -1;
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < target) {
                ans = mid;
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int higherbound(int[] arr, int target) {
        int ans = -1;
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    static int[] fristAndLastOccurence(int[] arr, int target) {
        int[] ans = new int[2];

        ans[0] = higherbound(arr, target - 1);
        ans[1] = lowerbound(arr, target + 1);

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 8, 8, 10 };
        int target = 8;

        int []occ = fristAndLastOccurence(arr, target);
        System.out.println(occ[1]-occ[0]+1);
    }
}
