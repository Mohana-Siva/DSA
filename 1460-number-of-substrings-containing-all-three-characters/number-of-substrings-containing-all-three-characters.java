class Solution {
    public int numberOfSubstrings(String s) {
        int[] counts = new int[3];
        int start = 0;
        int count = 0;
        int n = s.length();
        
        for (int end = 0; end < n; end++) {
            counts[s.charAt(end) - 'a']++;
           
            while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
              
                count += (n - end); 
               
                counts[s.charAt(start) - 'a']--;
                start++;
            }
        }
        
        return count;
    }
}