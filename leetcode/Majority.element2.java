class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        Arrays.sort(nums);
        int prev = nums[0];
        int n = nums.length;
        int count = 1;
        boolean added = false;
        if(n == 1){
            arr.add(prev);
            return arr;
        }
        if(n==2){
            arr.add(prev);
            if(prev != nums[1]){
                arr.add(nums[1]);
            }
            return arr;
        }
        for(int i = 1; i<n;i++){
            if(prev == nums[i]){
                count++;
            
            if(count > n/3 && !added){
                arr.add(prev);
                added = true;
            }
        } else{
            prev = nums[i];
            count = 1;
            added = false;
        }
        }
       return arr; 
    
}
}