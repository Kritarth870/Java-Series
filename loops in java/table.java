import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        for ( int i=1 ; i<=(n*10) ; i++){
                if(i%n==0){
                System.out.println(n + " X " + i/n +" = "+ i);
                
            }
        }
    }
}
