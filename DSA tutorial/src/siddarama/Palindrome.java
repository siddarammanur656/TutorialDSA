package siddarama;
//8. To find out whether the given String is Palindrome or not.
public class Palindrome {
        public static boolean palindrome(String str){

            int start=0;
            int last=str.length()-1;

            while (start<last){
                if(str.charAt(start)!=str.charAt(last)){
                    return false;
                }
                start++;
                last--;
            }
            return true;
        }

    public static void main(String[] args) {
        String str = "abaa";
        System.out.println(palindrome(str));
    }
}
