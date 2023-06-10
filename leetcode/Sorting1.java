
class Sorting1 {
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(int i =0;i<arr.length;i++){
            int k = arr[i].length() - 1;
            int m = arr[i].charAt(k) - '0';
            res[m-1] = arr[i].substring(0,k);
        }
        StringBuilder sb = new StringBuilder();
        for(int j =0;j<res.length;j++){
            sb.append(res[j]+" ");

        }
        return(sb.toString()).trim();
    }
    public static void main(String [] args){
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence( s));
    }
}