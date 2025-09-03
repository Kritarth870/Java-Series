import java.util.*;
public class GP {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1;
        int r=2;
            for (int i = 1; i <= n; i++){
            System.out.print(a+" ");
            a*=r;
        }      
    }    
}
