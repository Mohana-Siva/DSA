int maxProfit(int* nums, int pricesSize) {
    int prof,buy = nums[0];
    int maxprof=0;
    for(int i=1;i<pricesSize;i++){
        if(buy<nums[i]){
            prof = nums[i]-buy;
            if(maxprof<prof) maxprof = prof;
        }else{
            buy = nums[i];
        }
    }
    return maxprof;
}