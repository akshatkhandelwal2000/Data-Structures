class Solution {
    public int findComplement(int num) {
        // TC : O(N) // SC : O(N)
        String s = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c == '0') sb.append('1');
            else if(c == '1') sb.append('0');
        }
        String s1 = sb.toString();
        return Integer.parseInt(s1, 2);
    }
}