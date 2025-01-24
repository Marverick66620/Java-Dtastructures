import java.util.Scanner;

public class BestTimeToBuy {
    public static int Profit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input!");
            return;
        }
        int[] prices = new int[n];
        System.out.println("Enter the stock prices for each day: ");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        int maxProfit = Profit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}