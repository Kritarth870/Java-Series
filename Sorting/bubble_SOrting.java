import java.util.*;
public class bubble_SOrting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0 ; i<nums.length ; i++){
            nums[i] =  sc.nextInt();
        }

        // Bubble Sort 
        for(int i=0 ; i<nums.length-1 ; i++){
            for(int j=0 ; j<n-1-i ; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int ele : nums){
            System.out.println(ele);
        }
    }
}