public class Plus_Operator {
    public static void main(String[] args) {
        String s = "abc";
        s = s+"asd"+10+'z';

        System.out.println(s);

        System.out.println("abc"+10+20);

        // convert int to string 

        int n = 5;

        String k = "";

        k+=n;

        System.out.println(k+20+"abd");
    }
}
