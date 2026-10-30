import  java.util.*;
public class FindDuplicate {
    public static void main(String[]args){
        int arr [] = {1,2,3,2,5,6,7,8,9,10,1};
        HashMap<Integer,Integer> mi = new HashMap<>();
        ArrayList<Integer> ai =new ArrayList<>();
        for(int i : arr){
             mi.put(i,mi.getOrDefault(i,0)+1);
             if(mi.getOrDefault(i,0)>1){
                ai.add(i);
             }
        }

       for(Integer val : ai){
           System.out.println(val);
       }

    }
}
