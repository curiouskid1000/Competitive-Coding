class Solution {
    public int singleNumber(int[] nums) {
        
        Arrays.sort(nums);
        for(int i = 0; i<nums.length;){
            if(i < nums.length - 1 && nums[i] == nums[i+1]){
                i = i+3;
                }
            else{
                return nums[i];
            }
        }
       return nums[nums.length-1];
    }
}