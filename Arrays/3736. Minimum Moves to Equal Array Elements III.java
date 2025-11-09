class Solution {
    public int minMoves(int[] nums) {
        int largest=0;
        int loop=0;
    for (int i = 0; i<nums.length;i++){
        if(nums[i]>largest){
        largest=nums[i];
        }
    }
    for (int j = 0; j<nums.length;j++){
    loop += largest - nums[j];
    }
       return loop; 
    }
}
