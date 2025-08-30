import java.util.*;
public class three_digit_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th no : ");
        int n = sc.nextInt();

        if (n>=100 & n<1000){
            System.out.println("It is a three digit no.");
        }else{
            System.out.println("NOt a three digit no .");
        }


    }

    
}
