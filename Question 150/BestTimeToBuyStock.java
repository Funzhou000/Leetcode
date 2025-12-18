public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        
        int maximun = 0;
        for (int j = 0; j < prices.length; j++) {
            for (int i = j + 1; i < prices.length; i++) {
                if ((prices[i] - prices[j]) > maximun)
                    maximun = prices[i] - prices[j];
            }
        }
        if (maximun > 0) {
            return maximun;
        } else
            return 0;

    }
}
