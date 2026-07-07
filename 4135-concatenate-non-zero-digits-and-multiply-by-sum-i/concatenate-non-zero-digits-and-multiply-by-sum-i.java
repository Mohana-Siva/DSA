class Solution {
    public long sumAndMultiply(int n) {
        StringBuilder s = new StringBuilder("");
        int digit,temp=n;
        while(temp>0){
            digit = temp%10;
            if(digit!=0){
                s.append(digit);
            }
            temp = temp/10;
        }
        if(s.length()==0){
            return 0;
        }
        s.reverse();
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum += (s.charAt(i) - '0');
        }
        
        return Long.parseLong(s.toString()) * sum;
    }
}