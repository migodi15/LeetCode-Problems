class Solution {
    public int reverse(int x) {
        double reversed = 0;
        boolean isNegative = false;
        ArrayList<Integer> digits = new ArrayList<Integer>();
        
        if (x == 0) return 0;
        if (x < 0) {
            isNegative = true;
            x = - x;
        }
        
        // recorremos
        while (x != 0) {
            digits.add(x % 10);
            x = (x - x % 10) / 10;
        }
        
        // reescribimos
        for (int i = 0; i < digits.size(); i++) {
            if (reversed != 0 || digits.get(i) != 0) {
                reversed = reversed + digits.get(i) * Math.pow(10, digits.size() - 1 - i);
            }
        }
        if (isNegative) reversed = - reversed;
        
        // comprobamos que sigue siendo menor a 2^31
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) return 0;
        
        return (int)reversed;
    }
}