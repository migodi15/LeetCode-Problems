class Solution {
    public int romanToInt(String s) {
        int value;
        int nextValue;
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            value = value(s.charAt(i));
            
            if (i + 1 < s.length()) {
                nextValue = value(s.charAt(i + 1));
                
                if (value >= nextValue) {
                    result = result + value;
                } else {
                    result = result + nextValue - value;
                    i++;
                }
            } else {
                result = result + value;
            }
        }
        
        return result;
    }
    
    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return -1;
    }
}