import java.util.Scanner;
public class Swap_2_Numbers {
    public static void swap(int n , int m) {
        n=n+m;
        m=n-m;
        n=n-m;

        System.out.println(n + " " + m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 1st method
        // int c = m;
        // m=n;
        // n=c;
        // System.out.println(n + " " + m);

        // 2nd method
        swap(n, m);
       
        
    }    
}
