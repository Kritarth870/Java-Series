import java.util.*;
public class harshad_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int spare = n;
        int ld = 0;
        int sum = 0;

        while(n!=0){
            ld=n%10;
            sum=sum+ld;
            n/=10;
        }System.out.println(sum);

        if(spare%sum==0){
            System.out.println("It is a Harshad Number .");
        }else{
            System.out.println("It is Not a Harshad Number .");
        }
    }
}
