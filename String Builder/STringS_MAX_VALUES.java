import java.util.*;
public class STringS_MAX_VALUES {
    public static void main(String[] args) {
        String [] arr  = {"1234567891011121314" , "456" , "789"};

        int max = Integer.parseInt(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);

            if(max<=n){
                max=n;
            }else if(arr[i].length()>){

            }

        }


        System.out.println(max);
        

    }
}
