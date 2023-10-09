### Coding Question:

**Problem Statement:**

You are given a string containing both uppercase and lowercase letters. Write a function to count the number of occurrences of each letter and return the result as a dictionary.

**Function Signature:**

```python
def count_letters(s):
    """
    Args:
    - s: A string containing both uppercase and lowercase letters. (1 <= len(s) <= 10^5)

    Returns:
    - dict: A dictionary containing counts of each letter. Keys are letters, and values are counts.
    """
    # Your code here
```

**Example:**

```python
assert count_letters("Hello World") == {'H': 1, 'e': 1, 'l': 3, 'o': 2, ' ': 1, 'W': 1, 'r': 1, 'd': 1}
assert count_letters("Programming is Fun") == {'P': 1, 'r': 3, 'o': 1, 'g': 3, 'a': 1, 'm': 2, 'i': 3, 'n': 3, ' ': 3, 's': 1, 'F': 1, 'u': 1}
```

### Solution:

```python
def count_letters(s):
    """
    Args:
    - s: A string containing both uppercase and lowercase letters. (1 <= len(s) <= 10^5)

    Returns:
    - dict: A dictionary containing counts of each letter. Keys are letters, and values are counts.
    """
    letter_count = {}
    for char in s:
        if char.isalpha():
            char = char.lower()
            letter_count[char] = letter_count.get(char, 0) + 1
    return letter_count
```

This solution iterates through each character in the input string, checks if it is a letter, converts it to lowercase, and then updates the count in the dictionary. The resulting dictionary contains counts of each letter in the input string.
