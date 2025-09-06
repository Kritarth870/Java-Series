import java.util.*;
public class reverse_no_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++ ){
            for(int j=1 ; j<=n+1-i ; j++){
                // System.out.print(j);
                if(i%2!=0)
                System.out.print((char)(i+64));
                else{
                    System.out.print(i);
                }
            }System.out.println("");
        }
    }       
}
