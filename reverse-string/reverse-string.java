class Solution {
    public void reverseString(char[] s) {
        char aux;
        for(int i = 0; i < s.length / 2; i++){
            aux = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = aux;
        }
    }
}