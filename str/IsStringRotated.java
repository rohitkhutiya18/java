package str;
public class IsStringRotated {
    public static void main (String[] args){
         String a = "abcde",b="cddeab";
         b = b+b;
         
         if(b.contains(a)){
            System.out.println(true);
         }else{
            System.out.println(false);
         }

}
}
