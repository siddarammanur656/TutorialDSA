package Methods;

public class Sum_of_First_N_Natural_Numbers {
    public static void main(String[] args) {
        System.out.println(SumOfnaturalnum(5));
    }
    static int SumOfnaturalnum(int n){
        int sum=0;
        for(int i=1;i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
