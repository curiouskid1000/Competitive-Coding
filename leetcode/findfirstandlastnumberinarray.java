class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid;
        int res[] = new int[] {-1,-1};
        while(start<=end){
           mid = (start+end)/2;
            if(target<=nums[mid]){
                 end =mid-1;
            }
            else {
               start =mid+1;
            }
            if (nums[mid]==target){
                res[0] = mid;
                }
        }
        start =0;
        end = n-1;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]<=target){
                 start=mid+1;
            }
            else {
              end = mid-1;
            }
            if (nums[mid]==target){
                res[1] = mid;
                }
        }
        return res;
    }
}