class Solution {
    public int removeElement(int[] nums, int val) {
        int l = nums.length;
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < l; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
