import java.util.*;

public class Lower_Bound_Upper_Bound_In_Array {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        // Ques - Find the index of lower and upper bound of a number in array .
        
        int arr [] = {10,23,46,46,91,97,140,264};
        int num = 46;

        int low=0 , high = arr.length;
        int lowerbound = arr.length+1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] >= num){
                lowerbound = Math.min(lowerbound , mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }


        System.out.println(lowerbound);


    }
}
