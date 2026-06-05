# Two Pointer Algorithms in Java

This repository contains Java solutions to popular array problems solved using the **Two Pointer Technique**.

## Problems Included

### 1. Container With Most Water
**File:** `ContainerWithMostWater.java`

Finds the maximum amount of water that can be contained between two vertical lines.

#### Approach
- Use two pointers (`start` and `end`) at both ends of the array.
- Calculate the area formed by the lines.
- Move the pointer with the smaller height inward.
- Keep track of the maximum area found.

#### Time Complexity
- O(n)

#### Space Complexity
- O(1)

---

### 2. Move Zeroes
**File:** `MoveZeroes.java`

Moves all zeroes to the end of the array while maintaining the relative order of non-zero elements.

#### Approach
- Maintain two pointers:
  - `start` → position to place the next non-zero element.
  - `end` → traverses the array.
- Swap non-zero elements to the correct position.

#### Time Complexity
- O(n)

#### Space Complexity
- O(1)

---

### 3. Squares of a Sorted Array
**File:** `SquaresofaSortedArray.java`

Returns an array of the squares of each number sorted in non-decreasing order.

#### Approach
- Use two pointers at the beginning and end of the array.
- Compare absolute values by comparing squares.
- Fill the result array from the end towards the beginning.

#### Time Complexity
- O(n)

#### Space Complexity
- O(n)

---

## Concepts Used

- Two Pointer Technique
- Array Manipulation
- In-Place Swapping
- Greedy Pointer Movement

---

## Requirements

- Java 8 or higher

---

## Author 
-ADARSH KUMAR