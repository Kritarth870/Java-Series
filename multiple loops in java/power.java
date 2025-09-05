import java.util.Scanner;
public class power{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int power = 1;

        for(int i=1; i<=b; i++){
            power*=a; 
        }System.out.println(power);
    }
}