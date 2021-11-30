class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int[] map = new int[1001];
        
        for (int i = 0; i < nums1.length; i++) {
            map[nums1[i]]++;
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (map[nums2[i]] > 0) {
                intersection.add(nums2[i]);
                map[nums2[i]]--;
            }
        }
        
        int[] returnIntersection = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            returnIntersection[i] = intersection.get(i);
        }
        
        return returnIntersection;
    }
}