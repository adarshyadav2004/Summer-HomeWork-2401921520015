# Java String & Array Frequency Problems

This repository contains solutions to common string manipulation problems using character frequency counting and sorting techniques in Java.

## Problems Included

1. Valid Anagram
2. First Unique Character in a String
3. Ransom Note

---

# 1. Valid Anagram

### Problem Statement

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An **anagram** is a word or phrase formed by rearranging the letters of another word using all original letters exactly once.

### Example

```text
Input:
s = "anagram"
t = "nagaram"

Output:
true
```

### Approach

1. Check if both strings have the same length.
2. Convert strings into character arrays.
3. Sort both arrays.
4. Compare the sorted arrays using `Arrays.equals()`.

### Time Complexity

```text
O(n log n)
```

### Space Complexity

```text
O(n)
```

### Java Solution

```java
import java.util.*;

public class ValidAnagram {

    class Solution {
        public boolean isAnagram(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            char[] a = s.toCharArray();
            char[] b = t.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a, b);
        }
    }
}
```

---

# 2. First Unique Character in a String

### Problem Statement

Given a string `s`, find the first non-repeating character and return its index. If it does not exist, return `-1`.

### Example

```text
Input:
s = "leetcode"

Output:
0
```

### Approach

1. Create a frequency array of size 26.
2. Count occurrences of each character.
3. Traverse the string again.
4. Return the index of the first character with frequency 1.

### Time Complexity

```text
O(n)
```

### Space Complexity

```text
O(1)
```

### Java Solution

```java
class Solution {

    public int firstUniqChar(String s) {

        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
```

---

# 3. Ransom Note

### Problem Statement

Given two strings `ransomNote` and `magazine`, return `true` if the ransom note can be constructed using the letters from the magazine.

Each letter in the magazine can only be used once.

### Example

```text
Input:
ransomNote = "aa"
magazine = "aab"

Output:
true
```

### Approach

1. Count the frequency of each character in `magazine`.
2. Traverse `ransomNote`.
3. If a required character is unavailable, return `false`.
4. Otherwise decrease its count and continue.

### Time Complexity

```text
O(m + n)
```

Where:

- `m` = length of ransomNote
- `n` = length of magazine

### Space Complexity

```text
O(1)
```

### Java Solution

```java
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {

            if (count[c - 'a'] == 0) {
                return false;
            }

            count[c - 'a']--;
        }

        return true;
    }
}
```

---

# Concepts Used

- Character Frequency Array
- String Traversal
- Sorting Character Arrays
- Greedy Character Matching
- Hashing Technique using Arrays

---
## Author
ADARSH kr