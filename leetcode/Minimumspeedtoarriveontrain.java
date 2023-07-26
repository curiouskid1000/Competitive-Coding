class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int length = dist.length;
        int left = 1;
        int right = 10000000;
        int ans = -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(isPossible(dist,hour,mid,length)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] dist,double hour,int speed,int length){
        double ans = 0;
        for(int i =0;i<length;i++){
            double t = (double)dist[i]/(double)speed;
            if(i!=length-1){
                ans = ans + Math.ceil(t);
            }
            else{
                ans +=t;
                }
           if(ans>hour){
               return false;
           }
        }
        return true;
    }
}