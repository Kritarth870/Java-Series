import java.util.*;
    public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int a = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int AP = 1 + (n-1)*d;

        for (int i = a; i<=AP ; i+=d){

            System.out.print(i + ",");
        }

    }
}
