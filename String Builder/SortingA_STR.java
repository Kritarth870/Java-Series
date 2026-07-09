import java.util.*;

public class SortingA_STR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();


        // for String  

        char ch [] = new char[s.length()];

        for(int i=0 ; i<s.length() ; i++){
            ch[i] = s.charAt(i);
        }

        System.out.println(ch);

        Arrays.sort(ch);

        System.out.println(ch);


        // for string Builder first convert it to string

        StringBuilder sb = new StringBuilder(sc.nextLine());

        String k = sb.toString();

        System.out.println(k);

        char chs [] = new char[sb.length()];

        for(int i=0 ; i<sb.length() ; i++){
            chs[i] = sb.charAt(i); 
        }

        Arrays.sort(chs);

        System.out.println(chs);


    }
}
