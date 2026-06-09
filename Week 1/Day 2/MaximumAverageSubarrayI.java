    class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currsum = 0;
        // 1st cal window of size of k
        for (int i = 0; i < k; i++) {
            currsum += nums[i];
        }
        int maxsum = currsum;
        // again  Slide the window
        for (int i = k; i < nums.length; i++) {
            currsum += nums[i] - nums[i - k];// next element add and 1st remove
            maxsum = Math.max(maxsum, currsum);

        }
        return (double) maxsum / k;
    }
}
