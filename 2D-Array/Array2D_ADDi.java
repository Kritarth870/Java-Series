import java.util.Scanner;
public class Array2D_ADDi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int nums[][] = new int [n][n];

        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums[0].length ; j++){
                nums[i][j]= sc.nextInt();
            }
        }

        // for adding two 2D Arrays

        int ans[][] = new int [n][n];

        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums[0].length ; j++){
                ans[i][j] = arr[i][j]+nums[i][j];
            }
        }

        for(int i=0 ; i<ans.length ; i++){
            for(int j=0 ; j<ans[0].length ; j++){
                System.out.print(ans[i][j] + " ");
            }System.out.println();
        }


    }
}