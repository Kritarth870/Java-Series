import java.util.*;
public class Ques_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // IF N= 3
        // Ques = A B C 
            //    A B C
            //    A B C

        int n = sc.nextInt();
       

        // for(int i = 1; i<=n; i++){
        //         System.out.println("A B C");
        // }
        

        for(int i = 1; i<=n; i++){
             System.out.print(i); // for print no in front of line 
            for(int j = 1; j<=n; j++){
                System.out.print( " "+(char)(j+64));
            }System.out.println(" ");
        }
    }
}