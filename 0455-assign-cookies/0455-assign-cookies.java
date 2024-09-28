class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int j = s.length-1;
        int score = 0;
        for(int i = n-1; i >= 0; i--) {
            if(j >= 0 && g[i] <= s[j]) {
                score++;
                j--;
            }
        }
        return score;
    }
}

