class Solution {
    public boolean isPalindrome(String s) {
        // TC : O(N) // SC : O(1)
         if(s.length() == 1) return true;
         int start = 0, end = s.length()-1;
         while(start <= end){
             int currStart =  s.charAt(start);
             int currEnd = s.charAt(end);
             if(!Character.isLetterOrDigit(currStart)) {
                 start++;
             }
             else if(!Character.isLetterOrDigit(currEnd)) {
                 end--;
             }
             else {
                 if(Character.toLowerCase(currStart) != Character.toLowerCase(currEnd)) {
                     return false;
                 }
                 start++;
                 end--;
             }
         }
         return true;
    }
}