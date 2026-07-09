import java.util.*;

public class Check_SOrted_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = true; 
        for(int i=0 ; i<arr.length-1 ; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Sorted");
        }else{
            System.out.println("UnSorted");
        }
       
    }
}
