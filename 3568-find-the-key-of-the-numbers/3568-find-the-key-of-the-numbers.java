class Solution {
    public int generateKey(int num1, int num2, int num3) {
        // TC : O(1) // SC : O(1)
        String s1 = String.valueOf(num1);
        String s2 = String.valueOf(num2);
        String s3 = String.valueOf(num3);
        while(s1.length() < 4) {
            s1 = '0'+s1;
        }
        while(s2.length() < 4) {
            s2 = '0'+s2;
        }
        while(s3.length() < 4) {
            s3 = '0'+s3;
        }
        String s = "";
        for(int i = 0; i < 4; i++) {
            int min = Math.min(s1.charAt(i)-48, Math.min(s2.charAt(i)-48, s3.charAt(i)-48));
            s += String.valueOf(min);
        }
        int ans = Integer.valueOf(s);
        return ans;
    }
}