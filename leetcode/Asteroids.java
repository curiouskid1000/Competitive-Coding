class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();
       
        for(int i = 0; i < asteroids.length ;i++ ){
           while(!st.isEmpty()&&asteroids[i]<0&&st.peek()>0){
               int d=asteroids[i]+st.peek();
               if(d<0)
               st.pop();
               else if(d>0)
               asteroids[i]=0;
               else{
                asteroids[i]=0;
                st.pop();
               }
           } 
            if(asteroids[i]!=0)
           st.push(asteroids[i]);
         
        }
       
        int n=st.size();
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            ans[i]=st.pop();
        }
    return ans;
    }
}