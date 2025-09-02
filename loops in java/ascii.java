import java.util.*;
public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        // for A-Z = 65 - 90
        // for a-z = 97 - 122

        for(int i = n; i<=(n+25); i++){
            System.out.println(i+" = "+(char)i);
        }
    }    
}
