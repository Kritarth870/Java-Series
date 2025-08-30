import java.util.*;
public class no_divisible_by_5_but_not_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no : ");
        int m = sc.nextInt();

        if( m%5==0 & m%3!=0){
            System.out.println("The no is divosible by 5 bout no 3");
        }else{
            System.out.println("else");
        }
    }
}
