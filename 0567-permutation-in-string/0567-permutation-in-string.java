class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // TC : O(N) // SC : O(N)
        int n = s2.length();
        if (s1.length() > s2.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        int i = 0;
        int j = 0;
        int k = s1.length();
        int c = map.size();
        while (j < n) {
            if(map.containsKey(s2.charAt(j))) {
                map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j), 0)-1);
                if(map.get(s2.charAt(j)) == 0) {
                    c--;
                }
            }
            if(j-i+1 == k) {
                if(c == 0) {
                    return true;
                }
                if(map.containsKey(s2.charAt(i))) {
                    map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i), 0)+1);
                    if(map.get(s2.charAt(i)) == 1) {
                        c++;
                    }
                }
                i++;
            }
            j++;
        }
        return false;
    }
}
