import java.util.Scanner;

public class Rotate_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int k=sc.nextInt();

        int nums [] = new int[arr.length];

        int idx=0;
        for(int i=n-k ; i<arr.length ; i++){
            nums[idx] = arr[i];
            idx++;
        }
        for(int i=0 ; i<=k ; i++){
            nums[idx++] = arr[i];
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.println(nums[i]);
        }
    }
}
