class Solution {
    public int maxArea(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int nsr[] = new int[n];
        int nsl[] = new int[n];
        int maxarea = 0;
        // next smaller right
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = n;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // next small left
        // clear stack
        s = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // currentArea
        for (int i = 0; i < n; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxarea = Math.max(maxarea, currArea);

        }
        return maxarea;
    }

    public int largestRectangleArea(int[] heights) {
        return maxArea(heights);
    }
}