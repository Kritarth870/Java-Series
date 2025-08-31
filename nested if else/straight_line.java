import java.util.*;
public class straight_line {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int y3 = sc.nextInt();

        int a = (y2-y1)/(x2-x1);
        int b = (y3-y2)/(x3-x2);

        if (a==b){
            System.out.println("all point lies onn single line .");
        }else{
            System.out.println("do not lie on a single line .");
        }

    }
}
