class Solution {
    public long maximumPoints(int[] enemyEnergies, int currentEnergy) {
        // TC : O(NlogN) // SC : O(1)
        int n = enemyEnergies.length;
        Arrays.sort(enemyEnergies);
        if(currentEnergy < enemyEnergies[0]) {
            return 0;
        }
        long sum = 0;
        for(int i = 1; i < n; i++) {
          sum += enemyEnergies[i];
        }
        return (sum+currentEnergy)/enemyEnergies[0];
    }
}