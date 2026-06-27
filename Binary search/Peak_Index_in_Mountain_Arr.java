import java.util.Scanner;

public class Peak_Index_in_Mountain_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [] = {10,20,30,40,50,43,32,1};

        int low = 1 , high = arr.length-2;

        while (low<=high) {
            int mid = low + (high-low)/2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(mid);
                break;
            }else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]){
                low = mid+1;
            }else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]){
                high = mid-1;
            }
        }

    }
}
