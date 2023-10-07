
### Coding Question: Reverse a String

Write a Java program to reverse a given string.

#### Input
A string of any length.

#### Output
The reversed string.

#### Example
```java
Input: "Hello, World!"
Output: "!dlroW ,olleH"
```

### Java Solution:

```java
public class ReverseString {

    public static String reverse(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        // Example usage
        String input = "Hello, World!";
        String reversed = reverse(input);

        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
```

Save the above code in a file with a `.md` extension, and you can view it with any markdown viewer. Feel free to ask if you have any questions!
