import java.util.Scanner;

public class Updating_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "Kritarth Yadav";
        String k = "";
        for(int i=0 ; i<s.length() ; i++){
            if(i%2==0){
                k += 'a';
            }else{
                k+=s.charAt(i);
            }
        }

        System.out.println(k);

        s=k;
        System.out.println(s);
    }
}
