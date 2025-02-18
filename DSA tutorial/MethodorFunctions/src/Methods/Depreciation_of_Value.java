package Methods;

public class Depreciation_of_Value {
    public static void main(String[] args) {
         /*Initial value (original price of the asset)
           Depreciation rate (percentage reduction per year)
           Number of years (duration for depreciation)
          */
        //Calling method and diplaying result
        System.out.println(depreciation_value(10000,10,3));
    }
    //Method to calculate depreciation value
    public static double depreciation_value(double value,double rate, int year){
        for (int i = 1; i <=year ; i++) {
            value-=value*rate/100.0;
        }
        return value;
    }
}

