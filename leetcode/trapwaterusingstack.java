class Solution {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for(int i = 0; i<height.length;i++){
           while(!s.isEmpty() && height[s.peek()]< height[i]){
               int top = height[s.peek()];
                 s.pop();
               
               if(s.isEmpty()){
                   break;
               }
    
                int b = i - s.peek() - 1;
                int l = Math.min(height[i],height[s.peek()]) - top;
                sum += l * b;
           }
           s.push(i);
        }
     return  sum;
    }
}