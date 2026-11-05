package str;

public class ValidAnagram {
    public static void main(String[] args) {
        int arr[] = new int[26];
        String a = "nagaram",b="aanagram";
        for(char i : a.toCharArray()){
            arr[i -'a']++;
        }

        for(char i : b.toCharArray()){
            arr[i -'a']--;
        }

        for(int i : arr){
            if(i != 0){
                System.out.println(false);
                return ;
            }
        }
        System.out.println(true);
    }
}
