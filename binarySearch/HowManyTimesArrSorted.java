public class HowManyTimesArrSorted {
    static int nOfRotation(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] <= arr[st]) {
                end = mid;
            } else if (arr[mid] > arr[end] && arr[mid] > arr[st]) {
                st = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 2, 3, 4 };
        System.out.println(nOfRotation(arr));

    }
}
