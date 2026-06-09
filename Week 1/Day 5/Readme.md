# String Algorithms in Java

This repository contains Java solutions to popular string manipulation problems commonly asked in coding interviews and programming contests. The implementations focus on efficient character processing and the Two-Pointer technique.

---

## 📚 Problems Included

### 1. Longest Common Prefix
**File:** `LongestCommonPrefix.java`

Finds the longest common prefix string among an array of strings.

#### Problem Statement
Given an array of strings, return the longest common prefix among them. If there is no common prefix, return an empty string `""`.

#### Approach
- Use the first string as a reference.
- Compare each character with the corresponding character in all other strings.
- Stop when a mismatch is found or a string ends.
- Build the prefix using `StringBuilder`.

#### Time Complexity
- **O(n × m)**
  - `n` = number of strings
  - `m` = length of the shortest string

#### Space Complexity
- **O(m)**

---

### 2. Reverse String
**File:** `ReverseString.java`

Reverses a character array in-place.

#### Problem Statement
Given a character array, reverse the array without using extra space.

#### Approach
- Use two pointers:
  - `start` at the beginning
  - `end` at the end
- Swap characters and move pointers toward the center.

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(1)**

---

### 3. Valid Palindrome
**File:** `ValidPalindrome.java`

Checks whether a string is a palindrome after removing non-alphanumeric characters and ignoring letter case.

#### Problem Statement
Given a string, determine if it reads the same forward and backward considering only alphanumeric characters and ignoring case.

#### Approach
- Use two pointers from both ends.
- Skip non-alphanumeric characters.
- Compare characters in lowercase form.
- Return `false` on mismatch, otherwise continue.

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(1)**

---

## 🚀 Concepts Used

- String Manipulation
- Two-Pointer Technique
- Character Processing
- StringBuilder
- In-Place Array Operations
- Case-Insensitive Comparisons

---

## 🛠 Requirements

- Java 8 or higher

---

## 📂 Project Structure

```text
.
├── LongestCommonPrefix.java
├── ReverseString.java
├── ValidPalindrome.java
└── README.md
```

---

## ▶️ How to Run

### Compile

```bash
javac LongestCommonPrefix.java
javac ReverseString.java
javac ValidPalindrome.java
```

### Execute

```bash
java LongestCommonPrefix
java ReverseString
java ValidPalindrome
```

---

## 📈 Complexity Summary

| Problem | Time Complexity | Space Complexity |
|----------|----------------|------------------|
| Longest Common Prefix | O(n × m) | O(m) |
| Reverse String | O(n) | O(1) |
| Valid Palindrome | O(n) | O(1) |

---

## 🎯 Learning Outcomes

After completing these problems, you will understand:

- Efficient string traversal techniques
- Two-pointer algorithms
- In-place modifications
- Handling edge cases in strings
- Character validation and normalization
- Building optimized string solutions

---

## 👨‍💻 Author

**Adarsh Kumar**

- Java Developer
- Data Structures & Algorithms Enthusiast
- Problem Solver
