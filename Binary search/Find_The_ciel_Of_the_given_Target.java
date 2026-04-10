import java.util.Scanner;

public class Find_The_ciel_Of_the_given_Target{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int ans = 0;

        int low = 0 , high = n-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == target){
                System.out.println(arr[mid]);
                break;
            }
            else if(arr[mid] > target){
                high = mid-1;
            }else if(arr[mid] < target){
                low = mid+1;
            }
        }
        // 
        System.out.println(arr[high]);


    }
}