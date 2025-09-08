import java.util.Scanner;
public class Built_In_Functions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no : ");
        double a = sc.nextDouble();

        System.out.println("Enter the second no : ");
        double b = sc.nextDouble();
        
        System.out.println("Enter the third no : ");
        double c = sc.nextDouble();
        
        System.out.println("Enter the fourth no : ");
        double d = sc.nextDouble();

        
        // for finding power of a number.
        System.out.println(Math.pow(a, b));

        // for finding Square root of a number 
        System.out.println(Math.sqrt(a));
        
        //for finding cube root fo a number.
        System.out.println(Math.cbrt(a));

        // for finding random number.
        System.out.println(Math.random());

        // for getting number positive only.
        System.out.println(Math.abs(a));

        // for getting a least intiger no of a decimal.
        System.out.println(Math.floor(a));

        // for getting a greater integer of a decimal.
        System.out.println(Math.ceil(a));

        // for getting maximum of the given no 
        System.out.println(Math.max(a, b));

        // for getting minimum of the given no
        System.out.println(Math.min(a, b)); 

        // for getting maximum of the three given no.
        System.out.println(Math.max(a,Math.max(b, c))); 

        // for finding th max of four no .
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));

    }
}