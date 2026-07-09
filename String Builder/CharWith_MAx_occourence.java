import java.util.Arrays;
import java.util.Scanner;

public class CharWith_MAx_occourence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int fre [] = new int[26];

       for(int i=0 ; i<s.length() ; i++){
        int a = s.charAt(i);
        int idx = a-97;
        fre[idx]++;
       }

       int max = -1;

       for(int i=0 ; i<fre.length ; i++){
            max = Math.max(max, fre[i]);
       }

       for(int i=0 ; i<fre.length ; i++){
        if(fre[i]==max){
            System.out.println((char)(i+97));
        }
       }

        // Arrays.sort(fre);

        // System.out.println(fre[25]);
    }
}
