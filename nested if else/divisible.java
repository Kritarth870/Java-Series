import java.util.*;
public class divisible{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int n = sc.nextInt();

        if(n%5==0 & n%3==0){
            if(n%15!=0){
                System.out.println("The no is divisible ny 3 and 5 but not by 15.");
            }else{
                System.out.println("Not Divisible .");
            }
        }else{
            System.out.println("Not Divisible.");
        }
    }
}