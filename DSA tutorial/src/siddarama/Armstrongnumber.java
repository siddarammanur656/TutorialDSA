package siddarama;
//9. To find Armstrong Number between two given number.
public class Armstrongnumber {
    public static void main(String[] args) {

        int a=1;
        int b=1000;
        findArmstrongnumber(a,b);

    }
    public static void findArmstrongnumber(int a, int b){

        for(int i=a; i<b; i++){
            int num=i;
            int sum =0;

            while (num>0){
                int remender=num%10;
                sum= sum+(remender*remender*remender);
                num=num/10;
            }
            if(sum==i){
                System.out.println(sum);
            }
        }
    }
}
