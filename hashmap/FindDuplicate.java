import  java.util.*;
public class FindDuplicate {
    public static void main(String[]args){
        int arr [] = {1,2,3,2,5,6,7,8,9,10,1};
        HashMap<Integer,Integer> mi = new HashMap<>();

        for(int i : arr){
            if(mi.containsKey(i)){
                mi.put(i, mi.get(i)+1);
            }else{
                mi.put(i, 1);
            }
        }

        int ans [] = new int[mi.size()];
        int j= 0;
        for(Integer key : mi.keySet()){
            if(mi.get(key)>1){
                ans[j] = key;
                j++;
            }
            System.out.println(key+"---"+mi.get(key));
        }

        for (int i : ans) {
            System.out.println(i);
        }

    }
}
