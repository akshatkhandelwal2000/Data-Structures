class Solution {
    public int openLock(String[] deadends, String target) {
        // TC : O(N*W) // SC : O(N*W)
        Set<String> set = new HashSet<>();
        for(String deadend : deadends) {
            set.add(deadend);
        }
        String start = "0000";
        if(set.contains(start)) return -1;
        Queue<String> q = new LinkedList<>();
        q.add(start);
        int level = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                String curr = q.peek();
                q.poll();
                if(curr.equals(target)) return level;
                StringBuilder sb = new StringBuilder(curr);
                findNeighbours(q, sb, set);
            }
            level++;
        }
        return -1;
    }
    
    public void findNeighbours(Queue<String> q, StringBuilder curr, Set<String> set) {
        for(int i = 0; i < 4; i++) {
            char ch = curr.charAt(i);
            char dec = ch =='0' ? '9' : (char)(ch-1);
            char inc = ch == '9' ? '0' : (char)(ch+1);
            curr.setCharAt(i, dec);
            String decstr = curr.toString();
            if(!set.contains(decstr)) {
                set.add(decstr);
                q.add(decstr);
            }
            curr.setCharAt(i, inc);
            String incstr = curr.toString();
            if(!set.contains(incstr)) {
                set.add(incstr);
                q.add(incstr);
            }
            curr.setCharAt(i, ch);
        }
    }
}