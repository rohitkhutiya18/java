import java.util.ArrayList;
import java.util.HashMap;

public class InstersectionOfArray {
    public static void main(String[] args) {
        int []a ={1,2,2,3};
        int []b ={2,2,4};

        HashMap<Integer,Integer> mi= new HashMap<>();
        
        for(int val : a){
           mi.put(val, mi.getOrDefault(val, 0) + 1);
        }

       ArrayList<Integer> ai = new ArrayList<>();
        for (int val : b) {
            if(mi.getOrDefault(val, 0) > 0){
                mi.put(val, mi.get(val)-1);
                ai.add(val);
            }
        }

        for(Integer val : ai){
            System.out.println(val);
        }

     
    }    
}
