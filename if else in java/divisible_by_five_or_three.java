import java.util.*;
public class divisible_by_five_or_three{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no :");
        int n = sc.nextInt();

        if (n%5==0 & n%3==0){
            System.out.println("Divisible by three and five.");
        }else{
            System.out.println("Not divisible by three and five.");
        }
    }
}

