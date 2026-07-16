class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!mp.containsKey(nums[i])){
                mp.put(nums[i],1);
            }else{
                mp.put(nums[i],(mp.get(nums[i])+1));
            }
        }
        for(int n:nums){
            if(mp.get(n)<2 || mp.get(n)>2) {
                res=n;
                break;
            }
        }
        return res;
    }
}