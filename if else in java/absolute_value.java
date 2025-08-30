import java.util.*;
public class absolute_value {
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if ( n<=0 ){
            System.out.println(0-n);
        }else{
            System.out.println(n);
        }

    }
}
