# Sliding Window Problems in Java

This repository contains solutions to three classic Sliding Window problems frequently asked in coding interviews and competitive programming.

## Problems Covered

1. Longest Substring Without Repeating Characters
2. Permutation in String
3. Find All Anagrams in a String

---

# 1. Longest Substring Without Repeating Characters

## Problem Statement

Given a string `s`, find the length of the longest substring without repeating characters.

### Example

```text
Input: s = "abcabcbb"
Output: 3

Explanation:
The answer is "abc", which has length 3.
```

## Approach

- Use a sliding window with two pointers (`start` and `end`).
- Maintain a collection of characters currently present in the window.
- If the current character is not present:
  - Add it to the window.
  - Expand the window.
  - Update the maximum length.
- If a duplicate character is encountered:
  - Remove characters from the left side until the duplicate is removed.

## Algorithm

1. Initialize `start`, `end`, and `maxLength`.
2. Traverse the string using `end`.
3. If the character at `end` is not present in the current window:
   - Add it.
   - Update maximum length.
4. Otherwise:
   - Remove the character at `start`.
   - Increment `start`.
5. Continue until the entire string is processed.

## Time Complexity

```text
O(n²)
```

`contains()` and `remove()` operations on `ArrayList` take O(n) time.

## Space Complexity

```text
O(n)
```

## Java Solution

```java
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_length = 0;

        List<Character> list = new ArrayList<>();

        while (end < s.length()) {

            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }

        return max_length;
    }
}
```

---

# 2. Permutation in String

## Problem Statement

Given two strings `s1` and `s2`, return `true` if `s2` contains a permutation of `s1`, otherwise return `false`.

### Example

```text
Input:
s1 = "ab"
s2 = "eidbaooo"

Output:
true

Explanation:
The substring "ba" is a permutation of "ab".
```

## Approach

- Count character frequencies of `s1`.
- Generate every possible substring of size `s1.length()` from `s2`.
- Calculate frequency counts for the current window.
- Compare frequency arrays.
- If frequencies match, return `true`.

## Algorithm

1. Create a frequency array for `s1`.
2. Traverse `s2`.
3. For every starting position:
   - Build a frequency array for the current window.
   - Compare it with `s1` frequency array.
4. Return `true` if a match is found.
5. Otherwise return `false`.

## Time Complexity

```text
O((n - m + 1) × (m + 26))
```

Where:

- `n = s2.length()`
- `m = s1.length()`

## Space Complexity

```text
O(26)
```

## Java Solution

```java
class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int[] freq = new int[26];
        int m = s1.length();

        for (int i = 0; i < m; i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windSize = s1.length();

        for (int i = 0; i < s2.length(); i++) {

            int windIdx = 0, idx = i;
            int[] windFreq = new int[26];

            while (windIdx < windSize && idx < s2.length()) {
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++;
                idx++;
            }

            if (isFreqSame(freq, windFreq)) {
                return true;
            }
        }

        return false;
    }

    public boolean isFreqSame(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}
```

---

# 3. Find All Anagrams in a String

## Problem Statement

Given two strings `s` and `p`, return all starting indices of `p`'s anagrams in `s`.

### Example

```text
Input:
s = "cbaebabacd"
p = "abc"

Output:
[0, 6]

Explanation:
The substrings "cba" and "bac" are anagrams of "abc".
```

## Approach

- Use a fixed-size sliding window of length `p.length()`.
- Maintain frequency counts of:
  - Pattern string `p`
  - Current window in `s`
- Compare frequency arrays.
- Slide the window by removing one character and adding another.
- Record indices whenever frequencies match.

## Algorithm

1. Initialize frequency arrays for `p` and the first window of `s`.
2. Compare the arrays.
3. Slide the window one position at a time:
   - Remove the outgoing character.
   - Add the incoming character.
4. Compare frequency arrays after each slide.
5. Store matching starting indices.

## Time Complexity

```text
O(n × 26)
```

Since frequency comparison is constant time for lowercase English letters.

## Space Complexity

```text
O(26)
```

## Java Solution

```java
import java.util.*;

class Solution {

    public List<Integer> findAnagrams(String s, String p) {

        int n = s.length();
        int m = p.length();

        List<Integer> list = new ArrayList<>();

        if (m > n) {
            return list;
        }

        int[] Scount = new int[26];
        int[] Pcount = new int[26];

        for (int i = 0; i < m; i++) {
            Scount[s.charAt(i) - 'a']++;
            Pcount[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(Scount, Pcount)) {
            list.add(0);
        }

        for (int i = 1; i <= n - m; i++) {

            int prev = s.charAt(i - 1) - 'a';
            int next = s.charAt(i + m - 1) - 'a';

            Scount[prev]--;
            Scount[next]++;

            if (Arrays.equals(Scount, Pcount)) {
                list.add(i);
            }
        }

        return list;
    }
}
```

---

# Sliding Window Pattern Summary

| Problem | Window Type | Key Technique |
|----------|------------|--------------|
| Longest Substring Without Repeating Characters | Variable Size | Two Pointers + Character Tracking |
| Permutation in String | Fixed Size | Frequency Counting |
| Find All Anagrams in a String | Fixed Size | Frequency Array + Window Sliding |

---

# Key Concepts Learned

- Sliding Window Technique
- Two Pointer Approach
- Variable Size Window
- Fixed Size Window
- Frequency Arrays
- String Matching
- Anagram Detection
- Window Expansion and Shrinking

---

## Repository Structure

```text
Sliding-Window/
│
├── LongestSubstringWithoutRepeatingCharacters.java
├── PermutationInString.java
├── FindAllAnagramsInAString.java
└── README.md
```

---

## Author
ADARSH KUMAR