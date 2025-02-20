package LInearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name="Siddarama";
        char target='h';
        System.out.println(SearchString(name,target));
        System.out.println(SearchString1(name,target));
    }
    static boolean SearchString(String str,char target){
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i)){
                return true ;
            }
        }
        return false;
    }

    static boolean SearchString1(String str,char target){
        if (str.isEmpty()) {
            return false;
        }
        char [] arrchar=str.toCharArray();
        for (int i = 0; i < arrchar.length; i++) {
            if(arrchar[i]==target){
                return true;
            }
        }
        return false;
    }
}
