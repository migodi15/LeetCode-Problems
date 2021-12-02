class Solution {
    public boolean isPowerOfThree(int n) {
        double x = Math.log10(n) / Math.log10(3);
        
        //is integer
        if (x % 1 == 0) return true;
        
        return false;
    }
}