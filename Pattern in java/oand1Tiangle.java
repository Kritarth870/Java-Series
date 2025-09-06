import java.util.Scanner;
public class oand1Tiangle {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }System.out.println("");
        }
    }
}

