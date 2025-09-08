import java.util.Scanner;
public class comination_And_Permutation {
    public static int fact(int x){
        int xfact = 1;
        for (int i = 1; i <= x; i++) {
            xfact*=i;
        }
        return xfact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_n_r = fact(n-r);

        // for combination
        int ncr = (fact_n)/(fact_r * fact_n_r);        
        System.out.println("The combination is : " + ncr);

        // for permutation
        int npr = fact_n/fact_n_r;
        System.out.println("The permutation is : " + npr);
    }
}
