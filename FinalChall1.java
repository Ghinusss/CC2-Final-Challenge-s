//Ambales Geneses L.
//CITCS 1N - Group A
//Final Challenge No. 1: Retail Store Inventory Management (1D array)

public class FinalChall1 {
    public static void main(String[] args) {

        int[] stocks = {6, 12, 3, 7, 9, 2, 5, 8, 4, 10};
        double[] prices = {5.5, 8.9, 2.5, 9.1, 6.3, 4.8, 7.2, 3.9, 5.0, 10.0};

        double totalValue = 0.0;

        for (int i = 0; i < stocks.length; i++) {
            double itemValue = stocks[i] * prices[i];
            System.out.printf("Item %d - Stocks: %d - Prices: PHP %.2f - Total Value: PHP %.2f\n",
                              (i + 1), stocks[i], prices[i], itemValue);
            totalValue += itemValue;
        }

        System.out.printf("Total value of all items: PHP %.2f\n", totalValue);
    }
}