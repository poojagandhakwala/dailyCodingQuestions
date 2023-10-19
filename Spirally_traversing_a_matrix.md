# Spirally traversing a matrix

Given a matrix of size r*c, where r is number of rows and c is number of columns. Traverse the matrix in spiral form.

### Input Format

Input consists of two lines

The first line contains two integers r and c which denotes number of rows and columns respectively.

The next r lines contains c spaced integers, which are the elements of the matrix.

### Output Format

Print the spiral matrix.

### Example 1

#### Input


4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16

#### Output

1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10

#### Explanation:

We iterate spirally and print each element.

### Example 2

#### Input

3 4
1 2 3 4
5 6 7 8
9 10 11 12

#### Output

1 2 3 4 8 12 11 10 9 5 6 7

#### Explanation:

We iterate spirally and print each element.

### Constraints

1 <= r, c <= 100

0 <= matrix[i][j] <= 100

```java
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();

      int [][] arr = new int[r][c];
      for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
          arr[i][j] = sc.nextInt();
        }
      }

      int s = 0;
      while(r-s>0 && c-s>0){ // this condition for outer loop.
        if(r-s == 1){ // matrix ma jyare outer loop ak var run thay jay pachi jo ak j line vadhe tyare
          for(int i=s; i<c; i++){ // te ak line ne print karva mate
            System.out.print(arr[s][i] + " ");
          }
        }
          else{
          for(int i=s; i<c; i++){ // this condition is print the first row.
            System.out.print(arr[s][i] + " ");
          }
          for(int i=s+1; i<r; i++){ // this condition is print the last column.without (0,n-1) element.
              System.out.print(arr[i][c-1] + " ");
          }
        for(int i=c-2; i>=s; i--){ // this condition is print revesre the last row. without (n-1,n-1) element. 
           System.out.print(arr[r-1][i] + " ");
        }
        for(int i=r-2; i>s; i--){ // this condition is print reverse first column.without (n-1,0) & (0,0) element.
          System.out.print(arr[i][s] + " ");
        }
          }
      s++;
      r--;
      c--;
      }
      }
    }
```
