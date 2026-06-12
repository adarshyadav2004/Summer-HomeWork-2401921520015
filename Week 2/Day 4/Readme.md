# 📘 LeetCode Problem Solutions

This repository contains solutions to three important DSA problems:
- Reverse Words in a String
- Decode String
- Generate Parentheses

Each problem demonstrates a different concept: in-place manipulation, stack usage, and backtracking.

---

# 1️⃣ Reverse Words in a String

## 🧠 Problem
Reverse each word in a string while keeping word order same.

Example:

Input: "Mr Ding"
Output: "rM gniD"


## ⚙️ Approach
- Convert string to character array
- Identify word boundaries
- Reverse each word using two pointers

## 💡 Key Idea
- In-place reversal of each word
- No recursion or backtracking

## ⏱ Complexity
- Time: O(n)
- Space: O(1)

---

# 2️⃣ Decode String

## 🧠 Problem
Decode encoded strings like:

3[a2[c]]

Output:

accaccacc


## ⚙️ Approach
Uses two stacks:
- numberStack → stores repeat counts
- mainStack → stores characters

## 🔁 Steps
- Push numbers into numberStack
- Push characters into mainStack
- On encountering `]`:
  - Pop until `[`
  - Repeat substring
  - Push result back

## 💡 Key Idea
- Stack simulates recursion unwinding (implicit backtracking)

## ⏱ Complexity
- Time: O(n)
- Space: O(n)

---

# 3️⃣ Generate Parentheses

## 🧠 Problem
Generate all valid parentheses combinations for `n` pairs.

Example:

Input: n = 3
Output:
[
"((()))",
"(()())",
"(())()",
"()(())",
"()()()"
]


## ⚙️ Approach
Backtracking using recursion:
- Add "(" if open < n
- Add ")" if close < open

## 🔁 Rules
- open brackets ≤ n
- close brackets ≤ open brackets

## 🔙 Backtracking Concept
- Happens when recursive call returns
- No manual undo needed (string immutability handles it)

## ⏱ Complexity
- Time: O(4^n / √n)
- Space: O(n)

---

# 📊 Comparison

| Problem | Technique | Backtracking | DS Used |
|----------|----------|--------------|--------|
| Reverse Words | Two pointers | ❌ No | Array |
| Decode String | Stack | ⚠️ Implicit | Stack |
| Generate Parentheses | Recursion | ✅ Yes | Call stack |

---

# 🚀 Key Takeaways
- Backtracking = explore → return → try next option
- Stack problems simulate backtracking
- Recursion naturally handles state restoration
- Not all in-place problems involve backtracking