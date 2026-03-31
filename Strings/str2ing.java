import java.util.*;

public class str2ing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // charAt()  && length()   function --

        String s = sc.nextLine();

        for(int i=0 ; i<s.length() ; i++){
            System.out.println(s.charAt(i));
        }

        // indexOf() && compareTo() function ---

        System.out.println(s.indexOf('y'));

        String s1 = sc.nextLine();
        System.out.println(s.compareTo(s1));


        // contains && startsWith

        String name = "Kittu is Kritarth Yadav";

        System.out.println(name.contains("Yad"));
        System.out.println(name.startsWith("Kit"));

        // toLowerCase  &&  concat()  && toUpperCase

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.concat(s));

    }
}
