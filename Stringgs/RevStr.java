package Stringgs;

public class RevStr {
    static String reverse(String st) {
        String ans = "";
        String[] arr = st.split(" ");

        for (String word : arr) {
            System.out.println(word);
            ans = word + " " + ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        String st = "I am a good";
        System.out.println(reverse(st));
    }
}
