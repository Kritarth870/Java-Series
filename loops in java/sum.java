import java.util.*;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int z = 0;
        while(n!=0){
            z=n%10;
            sum=sum+z;
            n/=10;
            
        }
        System.out.println(sum);
    }
}