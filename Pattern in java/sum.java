import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ld = 0;
        int sum = 0 ;

        while(n!=0){
            ld=n%10;
            sum=(sum+ld)*10;
            n/=10;
        }System.out.println(sum/10);
        
    }
}
