class Solution {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        // TC : (NlogN) + O(N) // SC : O(N)
        int n = processorTime.size();
        Collections.sort(processorTime);
        Collections.sort(tasks, Collections.reverseOrder());
        int ans = 0;
        int j = 0;
        for(int i = 0; i < n; i++) {
            int max = Math.max(Math.max(processorTime.get(i)+tasks.get(j), processorTime.get(i)+tasks.get(j+1)), Math.max(processorTime.get(i)+tasks.get(j+2), processorTime.get(i)+tasks.get(j+3)));
            ans = Math.max(ans, max);
            j += 4;
        }
        return ans;
    }
}