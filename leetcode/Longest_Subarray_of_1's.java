class Solution {
    public int longestSubarray(int[] nums) {
       int zeroes = 0 ;
       int left = 0;
       int ans = 0;
       int n = nums.length;
      
       for(int i =0; i<n;i++){
           if(nums[i] == 0){
               zeroes++;
           }
           while(zeroes>1){
               if(nums[left] == 0){
                   zeroes--;
               }
               left++;
           }
        ans = Math.max(ans,i - left + 1 - zeroes);
       }
      
       return (ans == n) ? ans - 1 : ans;
    }
}
