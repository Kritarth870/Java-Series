import java.util.Scanner;

public class Find_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        int max = arr[0][0];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }        
        }


        System.out.println(max);
    }
}
