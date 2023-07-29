import java.util.ArrayList;

public class Greedy {
    public static void main(String[] args){
        int[] start = {1,3,0,5,8,5};
        int[] end = { 2,4,6,7,8,9};
        int count =0;
        ArrayList<Integer> ans = new ArrayList<>();
        int maxt = 1;
        ans.add(start[0]);
        int last = end[0];
        for(int i = 1;i<start.length;i++){
            if(start[i]>=last){
                ans.add(start[i]);
                count ++;
                last = end[i];
            }
        }
        System.out.println(count);
        System.out.println(ans);
    }
}
