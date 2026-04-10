import java.util.*;
public class Basic_Syntex_OF_Binary_Search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = {10,23,46,89,91,97,107,140,264};
        int target = 46;
        int n = arr.length; 

        int low = 0 , high = n-1;
        Boolean flag = false;

        while(low<=high){
            int mid = (high+low)/2;

            if(arr[mid] == target){
                flag = true;
                break;
            }else if(arr[mid] > target){
                high = mid-1; 
            }else if (arr[mid] < target) {
                low = mid+1;
            }
        }

        if (flag == true) {
            System.out.println("Target is present");
        }else{
            System.out.println("Target not found");
        }
    }
}