

## Interview Coding Question

### Problem Statement

You are given an array of integers, `nums`, representing a stock's prices on different days. The prices are in chronological order, and you want to maximize your profit by buying and selling at the right times. However, you can only make at most **two** transactions.

Write a function `maxProfit` in Java that takes the following parameters:

```java
public int maxProfit(int[] prices) {
    // Your code here
}
```

**Input:**
- An array of integers `prices`, where `prices.length >= 1`, and `0 <= prices[i] <= 10^4`.

**Output:**
- An integer representing the maximum profit that can be achieved with at most two transactions.

**Note:**
- You cannot engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).

### Example

```java
int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
int maxProfit = maxProfit(prices);

// Expected output: 6
// Buy on day 4 (price = 0) and sell on day 6 (price = 3), then buy on day 7 (price = 1) and sell on day 8 (price = 4).
```

### Constraints

- You must complete the task in O(n) time complexity.

---

## Solution

Here's a Java solution to the problem:

```java
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0;

        int[] buy = new int[3];
        int[] sell = new int[3];
        Arrays.fill(buy, Integer.MIN_VALUE);

        for (int price : prices) {
            for (int i = 1; i <= 2; i++) {
                buy[i] = Math.max(buy[i], sell[i - 1] - price);
                sell[i] = Math.max(sell[i], buy[i] + price);
            }
        }

        return sell[2];
    }

    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        MaxProfit solution = new MaxProfit();
        int maxProfit = solution.maxProfit(prices);
        System.out.println(maxProfit);
    }
}
```

This solution uses dynamic programming to find the maximum profit achievable with at most two transactions. It maintains two arrays, `buy` and `sell`, to track the maximum profit at each stage. The time complexity of this solution is O(n), as required.
