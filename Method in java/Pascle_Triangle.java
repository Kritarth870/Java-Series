import java.util.Scanner;
public class Pascle_Triangle {
    public static int fact(int f){
        int ffact = 1;
        for (int i = 1; i <= f; i++) {
            ffact*=i;
        }
        return ffact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= (n-i); j++) {
                System.out.print(" " + " ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print( "   " + fact(i)/(fact(j)*fact(i-j)));
            }System.out.println();   
        }
    }
}
