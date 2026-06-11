# 🧩 Java String Problems Solutions

This file contains solutions to 3 important string problems in Java.

---

## 1️⃣ Implement `strStr()` (Find First Occurrence)

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= h - n; i++) {
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == n) return i;
        }
        return -1;
    }
}
2️⃣ Check If One String is Subsequence of Another
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }
}
3️⃣ Repeated Substring Pattern
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                String sub = s.substring(0, i);
                StringBuilder sb = new StringBuilder();

                for (int j = 0; j < n / i; j++) {
                    sb.append(sub);
                }

                if (sb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}