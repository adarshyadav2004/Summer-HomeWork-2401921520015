class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // map to store elemnt:-> next greater elemnet
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;

        for (int i = n - 1; i >= 0; i--) {
            int current = nums2[i];
            // Maintain the stack: pop smaller elements
            while (!stack.isEmpty() && stack.peek() <= current) {
                stack.pop();
            }
            // If stack is empty, no greater element exists
            if (stack.isEmpty()) {
                map.put(current, -1);
            } else {
                map.put(current, stack.peek());
            }
            // Push current element onto stack for elements to its left
            stack.push(current);
        }
        // Build the result for nums1 using the map
        int[] nextgrtr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nextgrtr[i] = map.get(nums1[i]);

        }
        return nextgrtr;
    }
}