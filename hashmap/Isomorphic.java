import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String a = "add", b = "irr";
        HashMap<Character, Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();

        if (a.length() != b.length()) {
            System.out.println(false);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);

            if (m1.containsKey(ch1) && m1.get(ch1) != ch2) {
                System.out.println(false);
                return;
            }

            if (m2.containsKey(ch2) && m2.get(ch2) != ch1) {
                System.out.println(false);
                return ;
            }

            m1.put(ch1, ch2);
            m2.put(ch2, ch1);
        }

        System.out.println(true);
    }
}