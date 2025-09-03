import java.util.*;
public class highest_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The No : ");
        int n = sc.nextInt();


        // code for factors
        
        
        // for (int i = 1; i<=n ; i++ ){
        //     if (n%i==0){
        //     System.out.println(i);
        //     }
        // }



        // for highest factor

        for(int i = n-1; i>=1 ; i--){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
