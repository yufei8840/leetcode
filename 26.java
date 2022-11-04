class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int slowIndex = 1;
        int p = 0;
        for (int fastIndex = 1; fastIndex < l; fastIndex++) {
            if (nums[fastIndex] != nums[p]) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
                p++;
            }
        }
        return slowIndex;
    }
}
