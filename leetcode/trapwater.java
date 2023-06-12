import java.util.*;
class HelloWorld {
    public static int storeWater(ArrayList<Integer>height){
        int maxArea = 0;
        for(int i = 0 ; i<height.size();i++){
            for(int j = i+1 ; j<height.size();j++){
                int maxHeight = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currHeight = maxHeight * width;
                maxArea = Math.max(currHeight , maxArea);
            }
        }
        return maxArea;
    }
// 2 pointer approach
// public static int storeWater(ArrayList<Integer>height){
//         int maxArea = 0;
//         int lp = 0;
//         int rp = height.size() - 1;
//         while(lp<rp){
       
//                 int maxHeight = Math.min(height.get(lp),height.get(rp));
//                 int width = rp - lp;
//                 int currHeight = maxHeight * width;
//                 maxArea = Math.max(currHeight , maxArea);
//                  if(lp<rp){
//                 lp++;
//                 }
//             else{
//                 rp--;
//             }
//             }
//         return maxArea;
//     }

    
    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
    }
}