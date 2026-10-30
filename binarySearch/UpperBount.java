public class UpperBount {
    public static void main(String[] args) {
         int[] arr = {1,2,2,8,8,10,11,12,19};
         int k=9;

        int st = 0,end = arr.length-1;
           int ans = -1;
        while (end>=st) {
            int mid = st + (end-st)/2;
            if(arr[mid] >= k){
              ans = mid;
              end= mid-1;
            }else {
                st= mid+1;
            }
        }
        // if(ans != -1) {ans = arr[ans];}
        System.out.println(arr[ans]);
    }
}
