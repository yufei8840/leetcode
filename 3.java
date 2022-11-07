class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, l = s.length(), res = 0;
        Set<Character> occ = new HashSet<Character>();

        for (int j = 0; j < l; j++) {
            while (occ.contains(s.charAt(j))) {
                if (res < j - i) {
                    res = j - i;
                }
                occ.remove(s.charAt(i));
                i++;
            }
            if (!occ.contains(s.charAt(j))) {
                occ.add(s.charAt(j));
                if (res < occ.size()) {
                    res = occ.size();
                }
            }
        }
        return res;
    }
}
