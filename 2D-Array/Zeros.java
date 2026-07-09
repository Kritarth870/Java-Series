import java.util.Scanner;

public class Zeros {
    public static void main(String[] args) {
        int[][] arr = {
            {0,1,1,0},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };

        int[][] arr2 = new int[arr.length][arr[0].length];
        int k = 0;
        int l=0;
        
        for(int i=0 ; i<arr.length ; i++){
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==0){
                    k=j;
                    l=i;
                    break ;
                }  
            }
        }

        
            for (int j = 0; j < arr[0].length; j++) {
                arr[k][j]=0;
            }

            for (int j = 0; j < arr[0].length; j++) {
                arr[j][l]=0;
            }
            
      

        for(int i=0 ; i<arr.length ; i++){
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");                
            }
            System.out.println();
        }
    }
}
