import java.util.*;
public class validate_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();

        if((n+m > o) & (m+o > n ) & (n+o > m)){
            System.out.println("It is a Triangle . ");
        }else{
            System.out.println("It is not a Triangle .");
        }
    }
}