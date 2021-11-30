class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                index++;
                nums[index] = nums[i];
            }
        }
       
        return index+1;
    }
}