package str;

public class AtoI {
    public static void main(String[] args) {
        String a = "-4001";
        int ans = 0,temp=1;;
        for (int i = a.length() - 1; i > 0; i--) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {      
                 int val = a.charAt(i) - '0';
                 System.out.println(val);
                ans = (val * temp) + ans;
                temp = temp *10;
            } else {
                System.out.println(-1);
                return;
            }
        }
        if (a.charAt(0) == '-') {
            ans = ans * -1;
        } else if (a.charAt(0) >= '0' && a.charAt(0) <= '9') {
            ans = (a.charAt(0) - '0') * temp + ans;
        }
        System.out.println(ans);
    }
}
