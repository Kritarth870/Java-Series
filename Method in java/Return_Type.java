public class Return_Type {
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        greet(13);

    }

    // function of sum using return type
    public static int sum(int a , int b) {
        return (a+b);
    }


    // understanding the meaning of return 
    public static void greet(int n){
       if(n<=12) return; 

        System.out.println("good morning ");
    }
}
