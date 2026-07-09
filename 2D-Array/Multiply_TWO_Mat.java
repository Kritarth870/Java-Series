import java.util.Scanner;

public class Multiply_TWO_Mat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int o = sc.nextInt();
        int p = sc.nextInt();
        
        int a[][] = new int [n][m];
        int b[][] = new int [o][p];

        for(int i=0 ; i<a.length ; i++){
            for(int j=0 ; j<a[0].length ; j++){
                a[i][j] = sc.nextInt();
            }
        }


        
        for(int i=0 ; i<b.length ; i++){
            for(int j=0 ; j<b[0].length ; j++){
                b[i][j] = sc.nextInt();
            }
        }
        

        int ans[][] = new int[n][p];

        // now doing multiplication 

        for(int i=0 ; i<ans.length ; i++){
            for(int j=0 ; j<ans[0].length ; j++){
                for(int k=0 ; k<n ; k++){
                    ans[i][j] += (a[i][k]*b[k][j]);
                }
            }
        }



        for(int i=0 ; i<ans.length ; i++){
            for(int j=0 ; j<ans[0].length ; j++){
                System.out.print(ans[i][j] +  " ");
            }System.out.println();
        }
    }
}