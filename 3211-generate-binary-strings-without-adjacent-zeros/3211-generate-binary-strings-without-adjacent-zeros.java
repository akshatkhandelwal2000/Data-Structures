class Solution {
    public List<String> validStrings(int n) {
        // TC : O(2^N) // SC : O(N)
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        rec(n, ans, sb);
        return ans;
    }
    public void rec(int n, List<String> ans, StringBuilder sb) {
        if(sb.length() == n) {
            ans.add(sb.toString());
            return;
        }
        if(sb.length() == 0 || sb.charAt(sb.length()-1) == '1') {
            sb.append('0');
            rec(n, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        sb.append('1');
        rec(n, ans, sb);
        sb.deleteCharAt(sb.length()-1);
    }
}