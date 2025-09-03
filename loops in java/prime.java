import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = sc.nextInt();

        for(int i = 2; i<n; i++){
            if(n%i==0){
                System.out.println(" It is a Composit Number.");
                break;
            }else{
                System.out.println("It is a Prime no");
                break;
            }
        }
    }
}
