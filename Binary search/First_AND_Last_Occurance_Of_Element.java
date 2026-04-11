import java.util.*;

public class First_AND_Last_Occurance_Of_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr [] = {10,10,20,20,20,20,20,30,30,30,40,40};
        int n = arr.length;
        int target = 20;

        int ar[] = {-1,-1};


        // first position
        int fp =-1;

        int low = 0 , high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                // if(mid > 0 && arr[mid]==arr[mid-1]){
                //     high = mid-1;
                // }else{
                //     fp = mid;
                //     break;
                // }
                fp = mid;
                high = mid-1;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
               low = mid+1; 
            }
        }

        // last position
        int lp = -1;
        low = 0 ; high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                // if(mid<arr.length && arr[mid] == arr[mid+1]){
                //     low = mid+1;
                // }else{
                //     lp = mid;
                //     break;
                // }
                lp = mid;
                low =mid+1;
            }else if(arr[mid] > target){
                high = mid -1;
            }else {
                low = mid+1;
            }
        }

        System.out.println(fp +","+ lp);
    }
}
