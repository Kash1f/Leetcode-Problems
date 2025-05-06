package Leetcode.InterviewQuestions.Interview150.Arrays;

class BestTimetoBuySellStock {
    public int maxProfit(int[] prices) {
        
        //Step 1: Start by assuming the first price is the best day to buy
        //We initialize buy_price to the first price in the array
        //This represents the minimum price we've seen so far
        int buy_price = prices[0];

        //Step 2: Set profit to 0 initially, since we haven't sold anything yet
        //Profit will store the maximum profit we can achieve
        int profit = 0;

        //Step 3: Start from day 1 (index 1) because we already used index 0 as the initial buy price
        //We iterate through the prices array starting from the second day
        for (int i = 1; i < prices.length; i++) {

            //if today's price is lower than our current buy price,
            //it means we found a better (cheaper) day to buy
            //Update buy_price to today's price
            if (prices[i] < buy_price) {
                buy_price = prices[i]; //update buy price
            } else {
                //otherwise, calculate the profit if we sell today
                //current_profit is the difference between today's price and the buy_price
                int current_profit = prices[i] - buy_price;

                //compare with the best profit we've seen so far
                //and keep the maximum
                //We use Math.max to ensure profit always holds the highest value
                profit = Math.max(profit, current_profit);
            }
        }

        //finally, return the maximum profit found
        //After the loop, profit contains the maximum profit we can achieve
        return profit;
    }
}

//Explanation Table:
// | Day (i) | Price | buy_price  | current_profit  | profit |    Explanation                         |
// | ------- | ----- | ---------- | --------------- | ------ | -------------------------------------- |
// | 0       | 7     | 7          | —               | 0      | Initialize buy_price                   |
// | 1       | 1     | 1          | —               | 0      | Found cheaper price, update buy_price  |
// | 2       | 5     | 1          | 4               | 4      | 5 - 1 = 4 → update profit to 4         |
// | 3       | 3     | 1          | 2               | 4      | 3 - 1 = 2 → profit stays 4             |
// | 4       | 6     | 1          | 5               | 5      | 6 - 1 = 5 → update profit to 5         |
// | 5       | 4     | 1          | 3               | 5      | 4 - 1 = 3 → profit stays 5             |


// Day 0: buy at 7 → expensive, keep looking.

// Day 1: 1 < 7 → better! Update buy_price = 1.

// Day 2: 5 > 1 → potential profit = 4 → update profit = 4

// Day 3: 3 > 1 → profit = 2 → not better → keep profit = 4

// Day 4: 6 > 1 → profit = 5 → update profit = 5

// Day 5: 4 > 1 → profit = 3 → not better → keep profit = 5


// | Day (i) | Price | buy_price  | current_profit (Price - buy_price)   | profit (max so far) | Explanation                             |
// | ------- | ----- | ---------- | ------------------------------------ | ------------------- | --------------------------------------- |
// | 0       | 7     | 7          | —                                    | 0                   | Initialize buy_price to 7               |
// | 1       | 1     | 1          | —                                    | 0                   | Found cheaper price → update buy_price  |
// | 2       | 5     | 1          | 5 - 1 = 4                            | max(0, 4) = 4       | Sell at 5 → profit = 4                  |
// | 3       | 3     | 1          | 3 - 1 = 2                            | max(4, 2) = 4       | Profit less than current max → keep 4   |
// | 4       | 6     | 1          | 6 - 1 = 5                            | max(4, 5) = 5       | Higher profit → update to 5             |
// | 5       | 4     | 1          | 4 - 1 = 3                            | max(5, 3) = 5       | Lower profit → keep 5                   |
