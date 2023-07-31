public class Firstoccurence {
    public static int findoccurence(String haystack,String needle){
        if(haystack.contains(needle)){
            for(int i =0;i<haystack.length()-needle.length()+1;i++){
                if(haystack.charAt(i) == needle.charAt(0)){
                    int count = 0;
                    int k =i;
                    int j =0;
                    while(haystack.charAt(k) == needle.charAt(j)){
                        k++;
                        j++;
                        count++;
                        if(count == needle.length()){
                            return i;
                        }

                    }
                }
            }
        }
        else{
            return -1;
        }
        return -1;
    }
    public static void main(String[] args){
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(findoccurence(haystack,needle));
    }
}
