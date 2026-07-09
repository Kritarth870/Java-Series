import java.util.Scanner;

public class Manipulating_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.nextLine());
        
        System.out.println(s);

        s.setCharAt(1, 'k');
        System.out.println(s);
    }   
}
