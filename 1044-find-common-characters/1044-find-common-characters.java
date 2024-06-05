class Solution {
    public List<String> commonChars(String[] words) {
        // TC : O(N * k) // SC : O(1)
        int n = words.length;
        List<String> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        String s = words[0];
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 1; i < n; i++) {
            Map<Character, Integer> tempmap = new HashMap<>();
            String word = words[i];
            for(int j = 0; j < word.length(); j++) {
                tempmap.put(word.charAt(j), tempmap.getOrDefault(word.charAt(j), 0)+1);
            }
            for(char c : map.keySet()) {
                if(tempmap.containsKey(c) && map.get(c) > 0) {
                    map.put(c, Math.min(map.get(c), tempmap.get(c)));
                }
                else map.put(c, 0);
            }
        }
        for(char i : map.keySet()) {
            if(map.get(i) > 0) {
                for(int j = 0; j < map.get(i); j++) {
                    list.add(""+i);
                }
            }
        }
        return list;
    }
}