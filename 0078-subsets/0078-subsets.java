class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i=0; i<nums.length; i++) {
            int size = res.size();
            for (int j=0; j<size; j++) {
                List<Integer> item = new ArrayList<>(res.get(j));
                item.add(nums[i]);
                
                res.add(item);
            }
        }
        
        return res;
    }
}