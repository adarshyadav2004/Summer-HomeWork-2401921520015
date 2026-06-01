# Summer Homework - Java DSA Solutions

This repository contains Java solutions to popular Data Structures and Algorithms (DSA) problems. The solutions are implemented as part of summer homework assignments to strengthen problem-solving skills and understanding of algorithmic concepts.

## Problems Solved

### 1. Two Sum

#### Problem Statement
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

#### Approach
- Uses a brute-force approach with nested loops.
- Checks every possible pair of elements.
- Returns the indices of the pair whose sum equals the target.

#### Time Complexity
- **O(n²)**

#### Space Complexity
- **O(1)**

#### Example

Input:
```text
nums = [2, 7, 11, 15]
target = 9
```

Output:
```text
[0, 1]
```

---

### 2. Remove Duplicates from Sorted Array

#### Problem Statement
Given a sorted array, remove duplicates in-place such that each unique element appears only once and return the new length.

#### Approach
- Uses the Two Pointer Technique.
- One pointer tracks the last unique element.
- Another pointer traverses the array.
- Updates the array in-place without using extra space.

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(1)**

#### Example

Input:
```text
nums = [1,1,2]
```

Output:
```text
2
```

Modified Array:
```text
[1,2,_]
```

---

### 3. Best Time to Buy and Sell Stock

#### Problem Statement
Given an array `prices` where `prices[i]` is the stock price on the `i-th` day, find the maximum profit that can be achieved by buying and selling once.

#### Approach
- Maintain the minimum buying price seen so far.
- Calculate the profit for each day.
- Update the maximum profit whenever a larger profit is found.

#### Time Complexity
- **O(n)**

#### Space Complexity
- **O(1)**

#### Example

Input:
```text
prices = [7,1,5,3,6,4]
```

Output:
```text
5
```

Explanation:
```text
Buy at 1 and sell at 6.
Profit = 6 - 1 = 5
```

---

## Project Structure

```text
Summer-HomeWork-2401921520015/
│
├── TwoSum.java
├── RemoveDuplicates.java
├── BestTimeToBuyAndSellStock.java
└── README.md
```

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Arrays
- Two Pointer Technique
- Brute Force Approach
- Greedy Algorithm

## How to Run

### Compile Java Files

```bash
javac TwoSum.java
javac RemoveDuplicates.java
javac BestTimeToBuyAndSellStock.java
```

### Execute

```bash
java TwoSum
java RemoveDuplicates
java BestTimeToBuyAndSellStock
```

## Learning Outcomes

- Understanding array manipulation techniques
- Implementing brute-force and optimized solutions
- Applying the Two Pointer Technique
- Solving optimization problems using Greedy Algorithms
- Analyzing Time and Space Complexity
- Writing clean and efficient Java code

## Author

**Adarsh Yadav**

GitHub: https://github.com/adarshyadav2004

## License

This repository is created for educational and learning purposes.