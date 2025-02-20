package LInearSearch;

public class PersonWealth {
    public static void main(String[] args) {
        int [][] arr={
                {2,3,5,588},{4,56,5}
        };
        System.out.println(maxWealth(arr));
    }
    static int maxWealth(int [][] arr){
        int maxwel=0;
        for (int person = 0; person < arr.length; person++) {
            int currentwealth=0;
            for (int accounts = 0; accounts < arr[person].length; accounts++) {
                currentwealth=currentwealth+arr[person][accounts];
            }
            if(currentwealth>maxwel){
                maxwel=currentwealth;
            }
        }
        return maxwel;
    }
}
