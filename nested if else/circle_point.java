import java.util.*;
public class circle_point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=0;
        int y1=0;
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int r = sc.nextInt();
        double oa = Math.pow((x2-x1) + (y2-y1) , 2);

        if(oa>r){
            System.out.println("outside");
        }else if (oa<r){
            System.out.println("inside");
        }else if(oa == r){
            System.out.println("on the circle.");
        }        

    }
}
