class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        for(char i : map.keySet()) {
            int chara = i-'a';
            pq.offer(new int[]{chara, map.get(i)});
        }
        String ans = "";
        while(!pq.isEmpty()) {
            List<int[]> list = new ArrayList<>();
            int count = 1;
            while(count <= 2 && !pq.isEmpty()) {
                int i = pq.peek()[0];
                int j = pq.peek()[1];
                if(j > 1) {
                    list.add(new int[]{i,j-1});
                }
                if(ans.length() > 0 && ans.charAt(ans.length()-1) == (char)(i+97)) return "";
                ans += (char)(i+97);
                pq.poll();
                count++;
            }
            for(int i = 0; i < list.size(); i++) {
                pq.offer(list.get(i));
            }
        }
        return ans;
    }
}