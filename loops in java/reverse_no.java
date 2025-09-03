import java.util.*;
public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l=0;
        int sum = 0;

        while(n!=0){
            l=n%10;
            sum=(sum+l)*10;
            n/=10;
        }
        System.out.println(sum/10);

        if(sum/10 == n){
            System.out.println("It is a palindrome no .");
        }else{
            System.out.println("It is not a palindrome no .");
        }

        
    }    
}
