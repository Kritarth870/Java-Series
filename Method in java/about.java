public class about {
    public static void main(String[] args) {
        name("Kritarth Yadav");
        age(18);
        roll_no(40);     
    
    // multiple things in one function 
        one_liner("Kritarth Yadav" , 18 , 40);  
    }
    
    public static void name(String name) {
        System.out.println("The name is : " + name);
    }
    
    public static void age(int age){
        System.out.println("The age is : " + age );
    }
    
    public static void roll_no(int roll) {
        System.out.println("The Roll no is : " + roll);
    }

    // one liner
    public static void one_liner(String nam , int ummer , int rol ){
        System.out.println("Hello " + nam + " Your age is " + ummer + " and your roll no is " + rol);
    
    }
}