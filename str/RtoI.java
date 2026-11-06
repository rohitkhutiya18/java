package str;

import java.util.HashMap;

public class RtoI {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        String a = "DCCIV";
        int ans = 0;

        for (int i = 0; i < a.length(); i++) {
                 int current = map.get(a.charAt(i));
            if ( i+1 < a.length() && current < map.get(a.charAt(i+1))) {
                ans =  ans - current;
            } else {
                ans = ans + current;
            }
        }

  

        System.out.println(ans);
    }
}
