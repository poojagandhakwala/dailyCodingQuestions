

## Problem Statement

Given the array of integers `prices`, where `prices[i]` is the price of a given stock on day `i`, write a function `maxProfit` to find the maximum profit that can be made by buying and selling the stock once.

**Sample Input**
```
prices = {7, 1, 5, 3, 6, 4}
```

**Sample Output**
```
5  // 6-1=5
```

## Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }
}
```