class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        var nonZeroIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != nonZeroIdx) {
                    nums[nonZeroIdx] = nums[i];
                }
                nonZeroIdx++;
            }
        }
        for (; nonZeroIdx < nums.length; nonZeroIdx++) {
            nums[nonZeroIdx] = 0;
        }
    }
}