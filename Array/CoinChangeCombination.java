import java.util.ArrayList;
public class CoinChangeCombination {
    public static void main(String[] args) {
        int[] coins = {2, 3, 5};
        int total = 8;
        ArrayList<Integer> arr = new ArrayList<>();
        coinChange(coins, total, arr, 0);
    }
    static void coinChange(int[] coins, int total, ArrayList<Integer> arr, int prev){
        if(total == 0){
            System.out.println(arr);
            return;
        }
        if(total < 0){
            return;
        }
        for(int i = prev; i < coins.length; i++){
            arr.add(coins[i]);
            coinChange(coins, total - coins[i], arr, i);
            arr.remove(arr.size() - 1);
        }
    }
}