import java.util.Scanner;

public class Initilization_of_StringBuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // empty string builder
        StringBuilder x = new StringBuilder("");

        // Bhari hui String builder
        StringBuilder s = new StringBuilder("Kritarth Yadav");

        // extrnal 
        String k = "kittu";
        StringBuilder l = new StringBuilder(k);

        // outputs
        System.out.println(l);
        System.out.println(x.length());
        System.out.println(s);
        System.out.println(x.capacity());
    }
}