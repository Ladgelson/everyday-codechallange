// https://leetcode.com/problems/two-sum/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; ++i) {
            map.put(nums[i], i);
        }
        
        for(int i=0; i < nums.length; ++i) {
            int current = target - nums[i];
            if(map.containsKey(current)) {
                int index = map.get(current);
                if(index == i) continue;
                return new int[] {i, index};
            }
        }
        return new int[]{};
    }
}