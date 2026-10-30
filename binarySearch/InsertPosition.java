public class InsertPosition {
     public static void main(String[] args) {
         int arr [] ={1,2,3,4,6};
         int val = 7;

         int st = 0,end = arr.length-1;
         int ans = -1;
         while (st<=end) {
            int mid = st + (end-st)/2;

            if(arr[mid] >= val){
                 ans =mid;
                 end = mid-1;
            }else{
                st = mid+1;
            }
            
         }
         System.out.println(ans);
     }    
}
