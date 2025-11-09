class Solution {
    public int longestSubarray(int[] nums) {
    int count = 1;
    int maxcount = 1;
        for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] <= nums[i + 1]) {
            count++;
        } else {
            if (count>maxcount) {
            maxcount = count;
            }
            count = 1;
            }
        }
        if (count > maxcount) {
            maxcount =count;
        }
        if (count ==maxcount) {
            return maxcount;
        } else {
            return maxcount + 1;
        }

    }
}
