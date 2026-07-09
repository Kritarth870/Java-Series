import java.util.Scanner;

public class Toggle_Strings_Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // toggle means from lowercase to uppercase && uppercase element to lowercase;

        StringBuilder s = new StringBuilder(sc.nextLine());

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;

            if(ascii>=65 && ascii<=90){//capatalize it 
                ascii+=32;
                ch = (char)ascii;
                s.setCharAt(i, ch);
            }else{
                ascii-=32;
                ch = (char)ascii;
                s.setCharAt(i, ch);
            }
        }
        System.out.println(s);
    }
}
