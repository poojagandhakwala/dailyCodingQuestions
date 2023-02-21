

# Problem Statement

Write a function (`findWinner`) that takes a 3x3 board containing either `X`, `O`, or `null` as input, and returns the winner of the game (`X` or `O`) or `null` if there is no winner.

## Sample Input

```
[
    ["X", "O", "X"],
    ["O", "X",  "O"],
    ["O", "X",  "X"]
]
```

## Sample Output

`X`

## Solution

```java
public class Solution {
    public Character findWinner(Character[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][2] != null) {
                return board[i][0];
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[2][j] != null) {
                return board[0][j];
            }
        }
        
        // Check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[2][2] != null) {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[2][0] != null) {
            return board[0][2];
        }
        
        return null;
    }
}
```