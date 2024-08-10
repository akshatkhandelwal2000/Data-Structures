class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            String s = words[i];
            for(int j = i+1; j < n; j++) {
                StringBuilder sb = new StringBuilder(words[j]);
                String rev = sb.reverse().toString();
                if(rev.equals(s)) ans++;
            }
        }
        return ans;
    }
}