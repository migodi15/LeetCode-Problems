class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length; 
        if (n <= 1 || k == 0 || k == n) return; 
        if (k > n) k %= n; 

        int[] tmp = new int[k]; 
        
        for (int i = 0; i < k; i++) {
            tmp[i] = nums[n - k + i];
        }
             
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }   
        
        for (int i = 0; i < k; i++) {
              nums[i] = tmp[i]; 
        }
    }
}