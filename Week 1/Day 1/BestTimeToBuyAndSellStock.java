//package Week 1.Day 1;

public class BestTimeToBuyAndSellStock {
    class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buyprice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){// selling price high  and buy  price is low thats why profit
                int profit=prices[i]-buyprice;// todays profit
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
}
    
}
