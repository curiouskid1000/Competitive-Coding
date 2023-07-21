class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length ==0 || nums == null){
            return 0;
        }
        Arrays.sort(nums);
        int prev = nums[0];
        int count = 1;
        int ans = 1;
        for(int i =0;i<nums.length;i++){
            if(nums[i] == prev + 1){
                count++;
            }
            else if(nums[i] != prev){
                count = 1;
            }
            prev = nums[i];
            ans = Math.max(ans,count);
        }
        return ans;
    }
}