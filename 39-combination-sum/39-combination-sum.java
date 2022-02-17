class Solution {
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        solve(candidates, 0, ds, target, result);
        return result;
    }
    
    private void solve(int[] nums, int index, List<Integer> ds, int target, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }
        if(index == nums.length) {
            return;
        }
        if(nums[index] <= target) {
            ds.add(nums[index]);
            solve(nums, index, ds, target - nums[index], result);
            ds.remove(ds.size() - 1);
        }
        solve(nums, index + 1, ds, target, result);
    }
}