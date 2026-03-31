import java.util.Scanner;

public class Strings_Comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // equals()  vs  ==

        String s = "abcxyz";
        String k = "abc";
        k+="xyz";

        System.out.println(s.equals(k));
        System.out.println(s==k);
    }
}
