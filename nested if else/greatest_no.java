import java.util.*;
public class greatest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The no : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a>b) {
            if(a>c){
                System.out.println(a + " is the greatest no .");
            }else{
                System.out.println(c + " is the greatet no .");
            }
            
        }else{
            System.out.println(b + " is the greatest no .");
        }
    }
    
}
