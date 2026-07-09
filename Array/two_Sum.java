import java.util.*;
public class two_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ar[] = new int[2];

        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == target ){
                    ar[0] = arr[i];
                    ar[1] = arr[j];
                    break;
                }
            }
        }

        System.out.println(ar[0] + " " + ar[1]);
    }
}