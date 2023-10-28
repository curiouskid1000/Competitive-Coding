class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(i < k) {
                maxSum = sum;
                continue;
            }
            sum -= nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double)maxSum / k;
    }
}
