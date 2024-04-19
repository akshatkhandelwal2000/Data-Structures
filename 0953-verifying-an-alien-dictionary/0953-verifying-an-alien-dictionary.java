class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        // TC : O(M) + O(N*min(s1,s2)) // SC : O(M)
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for(int i = 0; i < words.length-1; i++) {
            String s1 = words[i];
            String s2 = words[i+1];
            int len = Math.min(s1.length(), s2.length());
            for(int j = 0; j < len; j++) {
                if(s1.charAt(j) != s2.charAt(j) && map.get(s1.charAt(j)) < 
                map.get(s2.charAt(j))) {
                    break;
                }
                else if(s1.charAt(j) != s2.charAt(j) && map.get(s1.charAt(j)) > 
                map.get(s2.charAt(j))) {
                    return false;
                }
                else if(j == len-1 && s1.length() > s2.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}