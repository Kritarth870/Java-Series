import java.util.*;
public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        int len = sc.nextInt();
        System.out.println("enter the breath : ");
        int bre = sc.nextInt();

        if((len*bre) > (2*(len+bre))){
            System.out.println("Area is greatre than the Parameter.");
        }else{
            System.out.println("Peremeter is greater than the area");
        }
         
    }    
}
