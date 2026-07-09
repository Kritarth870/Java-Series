import java.util.*;
public class Inserction_Sort {
    public static void main(String[] args) {
        int arr[] = {3,1,3,7,4,1};

        for(int i=1 ; i<arr.length ; i++){
            for(int j=i ; j>=1 ; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }

        for(int ele : arr){
            System.out.println(ele);
        }
        
    }
}
