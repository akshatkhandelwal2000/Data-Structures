class Solution {
    public String convertDateToBinary(String date) {
        // TC : O(10) // SC : O(1)
        int n = date.length();
        String ans = "";
        for(int i = 0; i < n; i++) {
            int num = 0;
            while(i < n && date.charAt(i) != '-') {
                num = num * 10+(date.charAt(i)-'0');
                i++;
            }
            String s = Integer.toBinaryString(num);
            ans += s;
            if(i == n) break;
            ans += '-';
        }
        return ans;
    }
}