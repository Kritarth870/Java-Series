import java.util.*;
public class greatest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b & a>c){
            System.out.println(a+ " is greatest no.");
        }else if (b>a & b>c) {
            System.out.println(b + " is the greatest no.");
        }else{
            System.out.println(c + " is the greatest no.");
        }

    }
}
