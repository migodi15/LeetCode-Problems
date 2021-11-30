class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String commonPrefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(commonPrefix) != 0) {
                commonPrefix = commonPrefix.substring(0, commonPrefix.length() - 1);
            }
        }
        return commonPrefix;
        
        /*
        if (strs.length == 1) return strs[0];
        
        String commonPrefix = "";
        int index = 0;
        
        while(true) {
            for(int i = 0; i < strs.length; i++) {
                if (strs[i].length() < index + 1) {
                    return strs[i].substring(0, index);   
                }
                commonPrefix = strs[0].substring(0, index + 1);
                if (!commonPrefix.equals(strs[i].substring(0, index + 1))) {
                    return strs[i].substring(0, index);
                }
            }
            index++;
        }
        */
    }
}