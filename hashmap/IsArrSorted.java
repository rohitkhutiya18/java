public class IsArrSorted {
    public static void main(String[] args) {
        int [] arr = {4,5,1,3,3};

        int count = 0;
        for (int i=0;i<arr.length-1;i++) {
            if(arr[i] > arr[i+1]){
                count++;
            }
        }

        if(count == 0){
            System.out.println(true);
        }else if(count == 1 && arr[0] > arr[arr.length-1]){
            System.out.println(true);
            return ;
        }

        System.out.println(false);


    }
}
