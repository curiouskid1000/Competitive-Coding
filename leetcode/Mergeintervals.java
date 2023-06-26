class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);

        ArrayList<int[]>results = new ArrayList<>();

        for(int i =0; i<intervals.length;i++){
            if(results.size() == 0 || results.get(results.size() - 1) [1] < intervals[i][0])
            results.add(intervals[i]);
            else
            results.get(results.size() - 1)[1] = Math.max(results.get(results.size() -1)[1], intervals[i][1]);
        }
        return results.toArray(new int[results.size()] []);
    }
}