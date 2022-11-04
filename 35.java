class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int res = nums.length;
        while (left <= right) {
            int middle = ((right - left) / 2) + left;
            if (target <= nums[middle]) {
                res = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return res;
    }
}
