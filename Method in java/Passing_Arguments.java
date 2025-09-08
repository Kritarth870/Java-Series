public class Passing_Arguments {
    public static void main(String[] args) {
        greet("Kritarth_yadav");
        greet("Modi ji ");
        num(1);
        sum(2,4);

    }

    // for taking input of a string in a function. 
    public static void greet(String name){
        System.out.println("Good Morning " + name );
    }

    // for taking integer in a function.
    public static void num(int no) {
        System.out.println("The no is : " + no);        
    }

    // for printing the sum of two no is 
    public static void sum(int n , int m) {
        System.out.println("The sum of two no is : " + (n+m));
    }

}
