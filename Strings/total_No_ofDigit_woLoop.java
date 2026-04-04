import java.util.*;
public class total_No_ofDigit_woLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = "";
        s+=Integer.toString(n);

        System.out.println(s.length());
    }
}
