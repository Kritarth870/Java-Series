public class divisible_by3 {
    public static void main(String[] args) {
        for(int i=1 ; i<=100 ; i++){
            if (i%3==0){
                System.out.println(i);
            }else{
                System.out.println(i + " is Not Divisible By 3.");
            }
        }
    }
}
