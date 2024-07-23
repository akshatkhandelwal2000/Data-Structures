class Solution {
    public long minimumCost(int m, int n, int[] horizontalCut, int[] verticalCut) {
        // TC : O(NlogN) // SC : O(horizontalCut.length+verticalCut.length)
        Arrays.sort(horizontalCut);
        Arrays.sort(verticalCut);
        for(int i = 0; i < horizontalCut.length/2; i++) {
            int temp = horizontalCut[i];
            horizontalCut[i] = horizontalCut[horizontalCut.length-i-1];
            horizontalCut[horizontalCut.length-i-1] = temp;
        }
        for(int i = 0; i < verticalCut.length/2; i++) {
            int temp = verticalCut[i];
            verticalCut[i] = verticalCut[verticalCut.length-i-1];
            verticalCut[verticalCut.length-i-1] = temp;
        }
        int i = 0;
        int j = 0;
        long ans = 0;
        int horizontalCuts = 1;
        int verticalCuts = 1;
        while(i < horizontalCut.length && j < verticalCut.length) {
            if(horizontalCut[i] >= verticalCut[j]) {
                ans += verticalCuts*horizontalCut[i];
                horizontalCuts++;
                i++;
            }
            else {
                ans += horizontalCuts*verticalCut[j];
                verticalCuts++;
                j++;
            }
        }
        while(i < horizontalCut.length) {
            ans += verticalCuts*horizontalCut[i];
            horizontalCuts++;
            i++;
        }
        while(j < verticalCut.length) {
            ans += horizontalCuts*verticalCut[j];
            verticalCuts++;
            j++;
        }
        return ans;
    }
}