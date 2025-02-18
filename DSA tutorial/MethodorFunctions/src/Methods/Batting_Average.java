package Methods;

public class Batting_Average {
    public static void main(String[] args) {
        //calling methods to calculate Batting average
        System.out.println("Average Runs : "+ Batting_average(1200,30) );
    }
    //method to calculate of average batting
    public static double Batting_average(int Run_score,int total_player_Outs ){
        int avg=0;
        if(total_player_Outs==0){
             avg=Run_score;
        }else{
            avg=(int)(Run_score/total_player_Outs);
        }
        return avg;
    }
}
