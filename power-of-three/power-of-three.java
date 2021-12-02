class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        
        double power = Math.log10(n) / Math.log10(3);                          
        if (power == Math.ceil(power)) return true;          
        
        return false;
        
        /* Recursivity
        
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else if (n % 3 == 0) {
            return isPowerOfThree(n/3);
        }
        return false;
        */
    }
}