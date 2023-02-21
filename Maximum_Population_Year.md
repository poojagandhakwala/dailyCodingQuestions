

**Problem Statement:**
Given a list of population numbers of a city over the years, determine the year with the maximum population.

**Input:**
The input to the function/method consists of two arguments:
1. Population numbers, a list of integers representing the population of the city for each year.

**Output:** 
Return an integer representing the year with the highest population.

**Example:**
Input: [2000, 2005, 2010, 2020, 2021]
Output: 2021

**Solution in Java:**

```java
public class Solution {
    public static int maxPopulationYear(int[] population) {
        int maxPopulationYear = population[0]; 
        int maxPopulation = 0; 
        for (int i = 0; i < population.length; i++){
            if (population[i] > maxPopulation){ 
                maxPopulation = population[i]; 
                maxPopulationYear = i; 
            }
        }
        return maxPopulationYear; 
    }
    
    public static void main(String[] args) {
        int[] population = {2000, 2005, 2010, 2020, 2021};
        System.out.println(maxPopulationYear(population)); 
    }
}
```