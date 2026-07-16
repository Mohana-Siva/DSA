class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        int temp;
        while(i<nums.length ){
            if(i<nums.length && j<nums.length && nums[j]!=0 && nums[i]!=0){
                j++;
                i++;
            }
            else{
            if(i<nums.length && j<nums.length && nums[j]==0 && nums[i]!=0){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            
            i++;
            }
        }
    }
}