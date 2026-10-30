import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        Map<String,List<String>> mi = new HashMap<>();
        String arr [] =  {"eat", "tea", "tan", "ate", "nat", "bat"};

        for(String word : arr){
            char[] wordArr = word.toCharArray();
            Arrays.sort(wordArr);
            String key = new String(wordArr);
            mi.putIfAbsent(key,new ArrayList<>());
            mi.get(key).add(word);
        }

    }

}
