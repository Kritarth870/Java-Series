import java.util.*;
public class oddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = sc.nextInt();
                        
        if(n%2==0 & n>=0 ){
            System.out.println("Even.");
        }else if( n%2!=0 & n>=0 ){
            System.out.println("Odd.");
        }else{
            System.out.println("not a valid input");
        }
    } 
}