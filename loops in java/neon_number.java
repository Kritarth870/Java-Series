import java.util.*;
public class neon_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ld = 0;
        int sq =n*n;
        int sum = 0 ;
        while (sq!=0) {
            ld=sq%10;
            sum=sum+ld;
            sq/=10;
        }
        System.out.println(sum);
        if(sum==n){
            System.out.println("Neon number .");
        }else{
            System.out.println("Not a Neon number .");
        }

    }    
}
