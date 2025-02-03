package siddarama;
//7. To calculate Fibonacci Series up to n numbers.
public class Fibonacciseriesuptonum {
    public static void main(String[] args) {
        int n=5;
        int first=0;
        int second =1;
        for(int i=1; i<=n; i++){
            System.out.print(first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
}
