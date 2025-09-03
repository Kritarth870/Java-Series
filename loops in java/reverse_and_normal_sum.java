import java.util.*;
public class reverse_and_normal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ld = 0;
        int rev = 0;

        while(n!=0){
            ld=n%10;
            rev=(rev+ld)*10;
            n/=10;
        }System.out.println(rev/10);
    }   
}
