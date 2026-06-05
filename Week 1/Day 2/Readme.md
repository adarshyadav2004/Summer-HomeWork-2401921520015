# Week 1 - Day 2 | Array Problems in Java

This file contains solutions to three array-based problems solved using efficient algorithms and data structures in Java.

---

# 1. Contains Duplicate

## Problem Statement
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Approach
- Use a **HashSet** to store visited elements.
- Traverse the array.
- If an element already exists in the set, return `true`.
- Otherwise, add it to the set.
- If the loop completes, return `false`.

## Code

```java
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }

        return false;
    }
}
```

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

### Example
```java
Input: [1,2,3,1]
Output: true
```

---

# 2. Maximum Average Subarray I

## Problem Statement
Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` that has the maximum average value and return this value.

## Approach
- Use the **Sliding Window Technique**.
- Calculate the sum of the first `k` elements.
- Slide the window through the array:
  - Add the new element.
  - Remove the outgoing element.
- Keep track of the maximum sum encountered.
- Return the maximum average.

## Code

```java
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum = 0;

        for (int i = 0; i < k; i++) {
            currsum += nums[i];
        }

        int maxsum = currsum;

        for (int i = k; i < nums.length; i++) {
            currsum += nums[i] - nums[i - k];
            maxsum = Math.max(maxsum, currsum);
        }

        return (double) maxsum / k;
    }
}
```

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### Example
```java
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75
```

---

# 3. Maximum Subarray

## Problem Statement
Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

## Approach
- Use **Kadane's Algorithm**.
- Maintain:
  - `currsum` → current subarray sum.
  - `maxsum` → maximum subarray sum found so far.
- At each step:
  - Extend the current subarray or
  - Start a new subarray from the current element.
- Update the maximum sum accordingly.

## Code

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currsum + nums[i] > nums[i]) {
                currsum += nums[i];
            } else {
                currsum = nums[i];
            }

            maxsum = Math.max(maxsum, currsum);
        }

        return maxsum;
    }
}
```

## Complexity Analysis
- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

### Example
```java
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6
```

---

# Concepts Practiced

- Arrays
- HashSet
- Sliding Window Technique
- Kadane's Algorithm
- Time and Space Complexity Analysis

---

# Complexity Summary

| Problem | Technique | Time Complexity | Space Complexity |
|----------|-----------|----------------|------------------|
| Contains Duplicate | HashSet | O(n) | O(n) |
| Maximum Average Subarray I | Sliding Window | O(n) | O(1) |
| Maximum Subarray | Kadane's Algorithm | O(n) | O(1) |

---

## Day 2 Progress
✅ Contains Duplicate  
✅ Maximum Average Subarray I  
✅ Maximum Subarray  

**Language:** Java  
**Topic:** Arrays