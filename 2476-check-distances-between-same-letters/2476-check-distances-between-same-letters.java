class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(s.charAt(i))) {
                int in = map.get(s.charAt(i));
                int dis = Math.abs(i-in)-1;
                int d = s.charAt(i)-'a';
                if(distance[d] != dis) return false;
            }
            else map.put(s.charAt(i), i);
        }
        return true;
    }
}