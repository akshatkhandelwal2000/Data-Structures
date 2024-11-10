class Solution {
    public int numSpecialEquivGroups(String[] words) {
        // TC : O(N) // SC : O(N)
        int n = words.length;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String s = words[i];
            char[] a = new char[s.length()/2+1];
            char[] b = new char[s.length()/2+1];
            int c = 0;
            int d = 0;
            for(int j = 0; j < s.length(); j+=2) {
                a[c++] = s.charAt(j);
            }
            for(int k = 1; k < s.length(); k+=2) {
                b[d++] = s.charAt(k);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            String s1 = new String(a);
            String s2 = new String(b);
            map.put(s1+s2, map.getOrDefault(s1+s2, 0)+1);
        }
        int ans = map.size();
        return ans;
    }
}