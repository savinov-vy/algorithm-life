package algorithm.sliding_window;

/**
 * Вам дан целочисленный массив prices,
 * где prices[i] — это цена NeetCoin в i-й день.
 * Вы можете выбрать один день для покупки одной монеты
 * NeetCoin и другой день в будущем для её продажи.
 * Верните максимальную прибыль, которую вы можете получить.
 * Вы можете отказаться от любых транзакций — в таком случае прибыль будет равна 0.
 */
public class BestTimeBuySellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{5,1,5,6,7,1,10}));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 0; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
}
