import java.util.Scanner;

public class Merge_two_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr1 [] = {5,7,9,15};
        int arr2 [] = {3,6,100};
        int[] ans = merge(arr1,arr2);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] merge(int []arr1 , int [] arr2) {
        int i=0 , j=0 , k=0;
        int m=arr1.length;
        int n = arr2.length;

        int ans [] = new int[m+n];
        while (i<m && j<n) {
            if(arr1[i]<arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }

        while (i<m) {
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while (j<n){
            ans[k]=arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
