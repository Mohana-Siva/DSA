class Solution {
    public boolean check(int[] nums) {
       
        int prev = nums[0];
        int count = 0;
     
        for(int i=1;i<nums.length;i++){

            if(i==(nums.length)-1){
                if(nums[i]>nums[0]) count++;
                
            }
            if(prev>nums[i]) {
                count++;
                
            }
            prev = nums[i];
            
        }
       if(count<=1) return true;
       return false;
    }
}