import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = 1;
        int l = 0;

        while(n!=0){
            l=n%10;
            p=p*l;
            n/=10;
        }
        System.out.println(p);
    }    
}
