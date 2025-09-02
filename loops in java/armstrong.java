import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // An Armstrong number is a number that is equal to the sum of its digit, each raised to the power of 
        // number of digit . for eg :- 153 = 1pow3 + 5pow3 + 3pow3 =1+125+27 =153
        
        int n = sc.nextInt();
        int original =n;
        int ld = 0;
        int sum = 0;
        while (n!=0) { 
            ld = n%10;
            sum = sum + (ld*ld*ld);
            n/=10;
        }

        if(sum == original ){
            System.out.println("It is a Armstrong Number.");
        }else{
            System.out.println("Not a Armstrong Number .");
        }



        
    }    
}
