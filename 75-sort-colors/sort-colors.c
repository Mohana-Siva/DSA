void sortColors(int* arr, int numsSize) {
    int k,temp;
    for(int i=0;i<numsSize;i++){
        k=i;
        for(int j=i+1;j<numsSize;j++){
            if(arr[j]<arr[k]){
                k=j;
            }
        }
        temp = arr[i];
        arr[i] = arr[k];
        arr[k] =temp;
    }
}