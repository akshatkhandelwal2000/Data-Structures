class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        long score = 0;
        Arrays.sort(skill);
        int max = 0;
        int min = 0;
        for(int i = 0; i < n/2; i++) {
            max = skill[i] + skill[n-i-1];
            score += skill[i] * skill[n-i-1];
            if(min != 0 && min != max) {
                return -1;
            }
            min = max;
        }
        return score;
    }
}