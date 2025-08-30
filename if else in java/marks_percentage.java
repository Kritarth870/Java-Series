import java.util.*;
public class marks_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Percentage : ");
        int n = sc.nextInt();

        if (100>=n & n>= 90) {
            System.out.println("Excelent");
        } else if (90>n & n>=80) {
            System.out.println("Very Good ");
        }else if (80>n & n>=70) {
            System.out.println("Good");
        }else if (70>n & n>=60) {
            System.out.println("Can do Better");
        }else if (60>n & n>=50) {
            System.out.println("Average");
        }else if (50>n & n>=40) {
            System.out.println("Below Average");
        }else if (40>n & n>=0) {
            System.out.println("Fail");
        }else {
            System.out.println("Not a valid input input");
        }
    }
}
