class Solution {
    public int removeDuplicates(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int n : nums){
        set.add(n);
       }

       int[] arr = new int[set.size()];
        int i = 0;
        
        for (Integer num : set) {
            arr[i++] = num; // Auto-unboxing happens here
        }
       Arrays.sort(arr);

       for(i=0;i<arr.length;i++){
        nums[i] = arr[i];
       }
       System.out.println(arr.length);
        return arr.length;
    }

   
}