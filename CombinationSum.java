class Solution {
    public static void perfectSum(int[]cand,int ind,int target,List<List<Integer>> ans,List<Integer> res)
    {
        if(cand.length==ind)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(res));
            }
            return;
        }

        if(cand[ind]<=target)
        {
            res.add(cand[ind]);
            perfectSum(cand,ind,target-cand[ind],ans,res);//picking element
            res.remove(res.size()-1);
        }
        perfectSum(cand,ind+1,target,ans,res);//not picking any element
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        perfectSum(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }
}
