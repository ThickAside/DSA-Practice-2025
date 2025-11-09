class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        vector<int> ans;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int twosum = nums[i] + nums[j];

            if (twosum < target) {
                i++;
            }
            else if (twosum > target) {
                j--;
            }
            else {
                ans.push_back(i+1);
                ans.push_back(j+1);
                break;
            }
        }

        return ans;
    }
};
