import java.util.*;
public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // factorial of a number .
        System.out.print("Enter the no : ");
        int n = sc.nextInt();
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact*i;
            System.out.println(i +"! is = " + fact);
        }
    }
}