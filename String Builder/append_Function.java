import java.util.*;
public class append_Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder s = new StringBuilder(sc.nextLine());

        // append() function &&  reverse()

        s=s.append("asd");

        System.out.println(s);

        // reverse()

        s=s.reverse();

        System.out.println(s);



    }
}
