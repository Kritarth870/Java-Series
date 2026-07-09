import java.util.*;

public class Change_NO_From_Sorted_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {40,12,78,34,100,57,23};
        // ans =    { 3, 0, 5, 2, 6 , 4, 1}

        int x = 0;
        for(int i=0 ; i<arr.length ; i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            
            for(int j=0 ; j<arr.length ; j++){
                if(arr[j]<min && arr[j]>0){
                    min = arr[j];
                    minidx = j;
                }
            }
            arr[minidx] = x;
            x--;
        }

        for(int ele=0 ; ele<arr.length ; ele++){
            System.out.print(arr[ele]*-1 + " ");
        }
    }
}
