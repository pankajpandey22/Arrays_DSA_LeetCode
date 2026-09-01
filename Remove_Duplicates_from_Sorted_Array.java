class Solution {
    public int removeDuplicates(int[] nums) {
        int a = 0;
        for (int i=1; i<nums.length; i++) {
            if (nums[i-1]==nums[i]) {
                a++;
            }
            else {
                nums[i-a] = nums[i];
            }
        }
        return nums.length-a;
    }
}
