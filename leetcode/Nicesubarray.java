public class Nicesubarray {
    class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,j=0,odd=0,count=0,res=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                odd++;
                count=0;
            }
            while(odd==k){
                if(nums[i++]%2!=0){
                    odd--;
                }
                count++;
            }
            res+=count;
            j++;
        }
        return res;
    }
}
}
