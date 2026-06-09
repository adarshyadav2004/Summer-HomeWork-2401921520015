# Matrix Algorithms in Java

This repository contains Java solutions to common matrix problems frequently asked in coding interviews and competitive programming. The solutions focus on efficient traversal and manipulation techniques.

---

## Problems Included

### 1. Matrix Diagonal Sum
**File:** `MatrixDiagonalSum.java`

Calculates the sum of the primary and secondary diagonals of a square matrix.

#### Approach
- Traverse the matrix once.
- Add elements from:
  - Primary diagonal: `mat[i][i]`
  - Secondary diagonal: `mat[i][n-i-1]`
- If the matrix size is odd, subtract the center element once because it gets counted twice.

#### Time Complexity
- O(n)

#### Space Complexity
- O(1)

---

### 2. Reshape the Matrix
**File:** `ReshapetheMatrix.java`

Reshapes a matrix into a new dimension `(r × c)` while preserving the original row-traversing order.

#### Approach
- Check if reshaping is possible:
  - Total elements in original matrix must equal total elements in reshaped matrix.
- Use a single loop to map indices from the original matrix to the new matrix.

#### Time Complexity
- O(m × n)

#### Space Complexity
- O(r × c)

---

### 3. Spiral Matrix
**File:** `SpiralMatrix.java`

Returns all elements of a matrix in spiral order.

#### Approach
Maintain four boundaries:
- `top`
- `bottom`
- `left`
- `right`

Traverse:
1. Left → Right
2. Top → Bottom
3. Right → Left
4. Bottom → Top

After each traversal, update the corresponding boundary.

#### Time Complexity
- O(m × n)

#### Space Complexity
- O(1) (excluding output list)

---

## Concepts Used

- Matrix Traversal
- Diagonal Traversal
- Spiral Traversal
- Index Mapping
- Boundary-Based Algorithms
- Array Manipulation

---

## Requirements

- Java 8 or higher

---

## How to Run

### Compile

```bash
javac MatrixDiagonalSum.java
javac ReshapetheMatrix.java