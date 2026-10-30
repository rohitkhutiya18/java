import java.util.HashMap;

public class FrequencyOfElement{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer,Integer> mi = new HashMap<>();

        for(int i : arr){
            if(mi.containsKey(i)){
                mi.put(i, mi.get(i)+1);
            }else{
                mi.put(i, 1);
            }
        }

        for(Integer key : mi.keySet()){
               System.out.println(key+"  "+mi.get(key));
        }
    }
}