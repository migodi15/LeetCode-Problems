class Solution {
    public int[] twoSum(int[] nums, int target) {
        int diff;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            }
            
            map.put(nums[i],i);
        }
        
        return null;
        
        
        /*
        BRUT FORCE 153 ms
        
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[] {i,j};
                }
            }
        }
        
        return null;
        */
    }
}