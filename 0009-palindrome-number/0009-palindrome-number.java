class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int y = 0;
        if(x < 0) return false;
        while(temp != 0) {
            y = y * 10 + (temp%10);
            temp /= 10;
        }
        if(x == y) return true;
        return false;
    }
}