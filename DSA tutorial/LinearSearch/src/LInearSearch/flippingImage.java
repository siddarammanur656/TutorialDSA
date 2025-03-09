package LInearSearch;

import java.util.Arrays;

public class flippingImage {
    public static void main(String[] args) {
       int [] [] image = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
            int [] [] ans= new int [image.length] [image.length] ;

            for(int i=0;i<image.length;i++){
                int k=0;
                for(int j=image[i].length-1; j>=0; j--){
                    ans[i][k++]=image[i][j];
                }
            }
            for(int i=0; i<ans.length; i++){
                for(int j=0; j<ans[i].length; j++){
                    if(ans[i][j]==1) ans[i][j]=0;
                    else if(ans[i][j]==0) ans[i][j]=1;
                }
            }
            return ans;

    }

}
