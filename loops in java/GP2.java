import java.util.Scanner;

public class GP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number till which the GP will Run : ");
        int n = sc.nextInt();
        
        int r = 3;


        for(int i=1 ; i<=n ; i++){
            System.out.println(r);
            r*=4;
        }
    }
}
