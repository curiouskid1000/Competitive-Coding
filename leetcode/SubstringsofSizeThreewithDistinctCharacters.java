public class SubstringsofSizeThreewithDistinctCharacters {
    class Solution {
    public int countGoodSubstrings(String s) {
        char[] ch = s.toCharArray();
        int n = s.length();
     
        int count =0;
        for(int i = 0; i< n -2;i++){
            if(ch[i]!=ch[i+1]&&ch[i]!=ch[i+2]&& ch[i+1]!= ch[i+2]){
                count++;
            }
        }
        return count;
    }
}
}
