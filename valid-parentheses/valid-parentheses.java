class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        if (!isOpen(s.charAt(0))) return false;

        Stack<Character> opened = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isOpen(s.charAt(i))) opened.push(s.charAt(i));
            else {
                if (opened.isEmpty()) return false;
                if (isValidCouple((char) opened.peek(), s.charAt(i))) opened.pop();
                else return false;
            }
        }

        if (opened.isEmpty()) return true;
        return false;
    }

    private boolean isValidCouple(char c1, char c2) {
        if (c1 == '(') return c2 == ')';
        if (c1 == '{') return c2 == '}';
        if (c1 == '[') return c2 == ']';
        return false;
    }

    private boolean isOpen(char c1) {
        return c1 == '(' || c1 == '{' || c1 == '[';
    }
}