import java.util.*;
public class axis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x==0 & y==0) {
            System.out.println("point lies on the origion .");
        }else if(x==0 ){
            System.out.println("Point lies on the Y-axis .");
        }else if (y==0){
            System.out.println("Point lise on the X-axis .");
        }
    }
}
