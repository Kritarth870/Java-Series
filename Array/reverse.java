import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int ar[] = new int [n];
        int j=0;
        for(int i=n-1 ; i>=0 ; i--){
            ar[j++] = arr[i];
        }

        for(int i=0 ; i<n ; i++){
            System.out.print(ar[i] + " ");
        }
        
    }
}