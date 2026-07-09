import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Steps for rotation the array 
        
        // step 1 - transpose the given matrix 
        // step 2 - then reverse the each row of matrix

        int n = sc.nextInt();
        int arr [][] = new int[n][n];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Transposing The matrix
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<i ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reversing the each row of matrix
        for(int i=0 ; i<arr.length ; i++){
            int a=0;
            int b = arr.length-1;

            while(a<b){
            int temp =  arr[i][a];
            arr[i][a]=arr[i][b];
            arr[i][b] = temp;
            a++;
            b--;
            }
        }

    // printing the final ans 
         for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
