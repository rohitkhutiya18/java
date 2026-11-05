public class PeakElement {
    static int peakElement(int[] arr) {
        int st = 0, end = arr.length - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] < arr[mid + 1]) {
                st = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[st];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 4, 3, 5, 6 };
        System.out.println(peakElement(arr));
    }
}
