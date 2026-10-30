public class LowerBound {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,11,12,19};
        int k=5;

        int st = 0,end = arr.length-1;
           int ans = -1;
        while (end>=st) {
            int mid = st + (end-st)/2;
            if(arr[mid] <= k){
              ans = mid;
              st = mid+1;
            }else {
                end = mid-1;
            }
        }
        if(ans != -1) {ans = arr[ans];}
        System.out.println(ans);
    }
}
