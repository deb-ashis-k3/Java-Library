package scaler.easy;

public class BestTimeToBuyAndSellStocks {
    public static void main(String[] args) {

        BestTimeToBuyAndSellStocks bestTimeToBuyAndSellStocks = new BestTimeToBuyAndSellStocks();

        int[] arr = { 1, 4, 5, 2, 4 };

        System.out.println(bestTimeToBuyAndSellStocks.maxProfit(arr));
    }

    public int maxProfit(final int[] arr) {
        if (arr == null || arr.length < 2)
            return 0;

        int minPrice = arr[0];
        int maxProfit = 0;
        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                int currentProfit = price - minPrice;
                if (currentProfit > maxProfit)
                    maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}
