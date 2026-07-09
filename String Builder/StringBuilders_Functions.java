import java.util.Scanner;

public class StringBuilders_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder("Kittu");
        StringBuilder s2 = new StringBuilder("Mittu");
        StringBuilder s3 = new StringBuilder(sc.nextLine());

        // for comparing two string 
        System.out.println(s.compareTo(s2));

        
        System.out.println(s3);

        
    }
}
