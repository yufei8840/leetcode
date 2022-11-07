class Solution {
    public int totalFruit(int[] fruits) {
        int res = 0, i = 0, l = fruits.length;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        
        for (int j = 0; j < l; j++) {
            cnt.put(fruits[j], cnt.getOrDefault(fruits[j], 0) + 1);
            while (cnt.size() > 2) {
                cnt.put(fruits[i], cnt.get(fruits[i]) - 1);
                if (cnt.get(fruits[i]) == 0) {
                    cnt.remove(fruits[i]);
                }
                i++;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }
}
