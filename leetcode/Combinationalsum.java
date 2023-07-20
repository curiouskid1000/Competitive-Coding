class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>List = new ArrayList<>();
        backtrack(List,new ArrayList<>(),candidates,target,0);
        return List;
    }
    private void backtrack(List<List<Integer>>list,List<Integer>TempList,int [] candidates,int remain,int start){
        if(remain <0) return;
        else if (remain == 0)list.add(new ArrayList<>(TempList));
        else{
            for(int i = start ; i< candidates.length;i++){
              TempList.add(candidates[i]);
              backtrack(list, TempList, candidates, remain - candidates[i], i);
              TempList.remove(TempList.size() - 1);
            }
        }
    }
}