class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))) {
                int in = map.get(s.charAt(i));
                int dis = Math.abs(i-in)-1;
                map.put(s.charAt(i), dis);
            }
            else map.put(s.charAt(i), i);
        }
        int in = 0;
        for(char c = 'a'; c <= 'z'; c++) {
            if(map.containsKey(c) && distance[in] != map.get(c)) {
                return false;
            }
            in++;
        }
        return true;
    }
}