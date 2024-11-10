class Solution {
    public int numSpecialEquivGroups(String[] words) {
        int n = words.length;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String s = words[i];
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int j = 0; j < s.length(); j+=2) {
                sb1.append(s.charAt(j));
            }
            for(int k = 1; k < s.length(); k+=2) {
                sb2.append(s.charAt(k));
            }
            char[] a = sb1.toString().toCharArray();
            char[] b = sb2.toString().toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            String s1 = new String(a);
            String s2 = new String(b);
            StringBuilder sb = new StringBuilder();
            sb.append(s1);
            sb.append(s2);
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
        }
        int ans = map.size();
        return ans;
    }
}