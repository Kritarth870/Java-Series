import java.util.Scanner;

public class Strings_Immutability {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // we cann't change individual characters in a string ,we can but we will lost lot of time and space

        String s = "Hello";
        // to heylo

        System.out.println(s.substring(0,2) + 'y' + s.substring(3));

    }
}
