import java.util.*;
public class sum_and_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = 0;
        int sum = 0;
        int rev = 0;

        while(n!=0){
            l=n%10;
            rev = (rev+l)*10;
            n/=10;
        }System.out.println("The Reverse of the given number is : " + rev/10);

        while (rev!=0) { 
            l=rev%10;
            sum=l+sum;
            rev/=10;
        }System.out.println("The Sum of the no is : " + sum);

    } 
}
