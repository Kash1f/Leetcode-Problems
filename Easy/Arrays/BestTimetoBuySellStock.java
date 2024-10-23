package Easy.Arrays;

public class BestTimetoBuySellStock {

public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];
            }
        }
}

    public static void main(String[] args) {
        
    }
}
