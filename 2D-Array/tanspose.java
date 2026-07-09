import java.util.*;
public class tanspose{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // With out using extra 2d array

        int arr [][] = new int [n][m];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=0 ; j<i; j++){
        //         int temp = arr[j][i];
        //         arr[j][i]= arr[i][j];
        //         arr[i][j]= temp;
        //     }
        // }


        for(int i=0 ; i<arr[0].length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                System.out.print(arr[j][i] + " ");
            }System.out.println();
        }
    }
}