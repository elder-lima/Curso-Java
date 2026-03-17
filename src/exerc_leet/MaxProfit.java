package exerc_leet;

import java.util.HashMap;
import java.util.Map;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = new int[]{7,2,9,3,1};
        System.out.println(maxProdit(prices));
        // Entrada: preços = [7,1,5,3,6,4]
        // Saída: 5
        // Explicação: Compre no dia 2 (preço = 1) e venda no dia 5 (preço = 6), lucro = 6-1 = 5.
        //Observe que comprar no segundo dia e vender no primeiro dia não é permitido, pois você deve comprar antes de vender.

    }

    public static int maxProdit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for (int x=0; x <= prices.length - 1; x++) {
            int value = prices[x];
            if (value < buy) {
                buy = value;
            }
            profit = Math.max(profit, value - buy);
        }
        return profit;
    }

}
