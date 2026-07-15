class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1,j=1;
        while(j<nums.length){
            if(nums[i-1]==nums[j]){
                j++;
            }
            else if(nums[i-1]!=nums[j]){
                int curr = j;
                while(curr>=i){
                    nums[curr] = nums[j];
                    curr--;
                }
                i++;
                j++;
            }
        }
        return i;
    }
}