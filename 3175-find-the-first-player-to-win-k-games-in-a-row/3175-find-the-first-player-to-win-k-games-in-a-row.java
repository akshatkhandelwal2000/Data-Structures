class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        // TC : O(N) // SC : O(N)
        int n = skills.length;
        int max = 0;
        int ind = -1;
        if(k >= n) {
            for(int i = 0; i < n; i++) {
                if(skills[i] > max) {
                    max = skills[i];
                    ind = i;
                }
            }
            return ind;
        }
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(new int[]{skills[i], i});
        }
        boolean flag = true;
        int player = 0;
        int p = 0;
        while(flag) {
            if(list.size() == 1) {
                flag = false;
                break;
            }
            if(list.get(0)[0] > list.get(1)[0]) {
                list.remove(list.get(1));
                if(player != list.get(0)[1]) {
                    p = 0;
                }
                player = list.get(0)[1];
            }
            else if(list.get(1)[0] > list.get(0)[0]){
                list.remove(list.get(0));
                if(player != list.get(0)[1]) {
                    p = 0;
                }
                player = list.get(0)[1];
            }
            if(k == 1) {
                flag = false;
                return list.get(0)[1];
            }
            if(list.get(0)[1] == player) {
                p++;
                if(p == k) {
                    flag = false;
                }
            }    
        }
        return list.get(0)[1];
    }
}