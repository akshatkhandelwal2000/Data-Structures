class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        // TC : O(N) // SC : O(N)
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < pick.length; i++) {
            if(map.containsKey(pick[i][0])) {
                map.get(pick[i][0]).add(pick[i][1]);
            }
            else {
                List<Integer> list = new ArrayList<>();
                list.add(pick[i][1]);
                map.put(pick[i][0], list);
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(map.containsKey(i)) {
                List<Integer> list = map.get(i);
                int[] fre = new int[11];
                for(int l : list) {
                    fre[l]++;
                }
                for(int f : fre) {
                    if(f > i) {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}