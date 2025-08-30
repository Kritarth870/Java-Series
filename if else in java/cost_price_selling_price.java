import java.util.*;
public class cost_price_selling_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter the selling price : ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("You made a profit of : " + (sp-cp) + " Rs");
            
        }else if(sp==cp) {
            System.out.println("Nither profit nither loss. " + "0 Rs");
        }
        else{
            System.out.println("YOu made a loss of :" + (cp - sp) + " Rs");
        }

    }
    
}
