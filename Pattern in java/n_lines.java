import java.util.*;
public class n_lines {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
        // int m = sc.nextInt();

        // ques = n = 4

        // output = 1111
        //          2222
        //          3333
        //          4444

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i + " ");
            }System.out.println("");
        }
    }
}