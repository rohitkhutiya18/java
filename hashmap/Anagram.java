public class Anagram {
    public static void main(String[] args) {
        String a = "silent",b="listen";
        
        int arr[] = new int[26];

        for(char val:a.toCharArray()){
            arr[val - 'a']++;
        }


        for(char val:b.toCharArray()){
            arr[val - 'a']--;
        }

        for(int i : arr){
            if(i>0){
                System.out.println(false);
                return ;
            }
        }

        System.out.println(true);
    }
}

