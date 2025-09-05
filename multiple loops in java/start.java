import java.util.*;
public class start{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i =1; i<=n; i++){ // lines
            for (int j=1; j <= n-i ; j++) { // spaces
                System.out.print(" "+" ");
            }for (int k = 1; k <= i; k++){  // stars,numbers,alpehabets
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}