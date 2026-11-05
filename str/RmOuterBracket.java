package str;

public class RmOuterBracket {
    public static void main(String[] args) {
        String s = "(()())(())";
        String res = "";

        int open = 0;

        for (char val : s.toCharArray()) {
            if (val == '(') {
                if (open > 0) {
                    res = res + val;
                }
                open++;
            } else {
                 open--;
                if (open > 0) {
                    res = res + val;
                }
               
            }
        }
        System.out.println(res);
    }
}
