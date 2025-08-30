import java.util.*;
public class calculator {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no : ");
        int a = sc.nextInt();
        System.out.println("Enter the second no : ");
        int b = sc.nextInt();

        System.out.println("The sum is = "+ (a+b) );
        System.out.println("The difference is = "+(a-b));
        System.out.println("The multiplication is = "+(a*b));
        System.out.println("The division is = "+(a/b));
        System.out.println("The remainder is = "+(a%b));

        


    }
    
}
