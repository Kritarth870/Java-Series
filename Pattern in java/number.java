import java.util.*;
public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i = m; i<=n; i++){
            for(int j = 2; j<i; j++){
                if(i%j==0){
                System.out.println(i);
                }else{
                    System.out.println(j);
                }
            }System.out.println("");
        }
    }
}
