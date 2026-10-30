public class UnqiueElement {
    static int findUnique(int[] arr) {
        int st = 0, end = arr.length - 1;
        while (st < end) {
            int mid = st + (end - st) / 2;
            if (mid % 2 != 0) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                st = mid + 2;
            } else {
                end = mid;
            }
        }

        return arr[st];
    }

    public static void main(String[] args) {
        int[] arr = { 1,2, 2, 3, 3, 4, 4, 5, 5, 6, 6 };
        System.out.println(findUnique(arr));
    }
}
