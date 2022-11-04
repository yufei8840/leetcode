class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int right = nums.length - 1;
        int left = 0;
        int k = nums.length - 1;
        while (left <= right) {
            if (nums[left] * nums[left] < nums[right] * nums[right]) {
                result[k--] = nums[right] * nums[right];
                right--;
            } else {
                result[k--] = nums[left] * nums[left];
                left++;
            }
        }
        return result;
    }
}
