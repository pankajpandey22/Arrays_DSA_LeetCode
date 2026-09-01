class Solution {
    public int[] twoSum(int[] nums, int t) {

        HashMap<Integer, Integer> check = new HashMap<>();

        for (int i=0; i<nums.length; i++) {

            if (check.containsKey(t-nums[i])) {
                return new int[]{check.get(t-nums[i]), i};
            }

            else {
                check.put(nums[i], i);
            }
            
        }

        return null;

    }
}
