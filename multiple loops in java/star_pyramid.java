import java.util.Scanner;
public class star_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }for (int j = 1; j <=2*i-1 ; j++){
                // System.out.print(j+" ");   for number pyramid
                System.out.print("*"+" ");   // for star pyramid
                // System.out.print((char)(j+64)+" ");   //for a,b,c,d in star pyramid form
            }
            System.out.println();
        }

        // 2nd method

        // int n=sc.nextInt();
        // int nsp = n-1;
        // int nst = 1;
        

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <= nsp; j++) {
        //         System.out.print(" " + " ");
        //     }
        //     for (int j = 1; j <= nst; j++) {
        //         System.out.print("*"+" ");
        //     }
        //     nsp--;
        //     nst+=2;
            
        //     System.out.println();
        // }

     
    }
}
