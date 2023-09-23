class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        // TC : O(NlogN + KlogN) - O(NlogN) // SC : O(N + N) - O(N)
        int n = profits.length;
        // create an array of profits.length of size 2 for each capital and profits i to store capital and its profits at i index
        int[][] projects = new int[n][2];
        for(int i = 0; i < n; i++) {
            // store capital and profits in projects in form of [i][0] and [i][1] that is 00 and 01 and increment i that is [1][0] [1][1] and so on until n that is profits.length
            projects[i][0] = capital[i];
            projects[i][1] = profits[i];
        }
        // sort projects based on capital to get the lowest capital on top to get that profit because intially we will be having lowest capital and using that we can only select project that requires lowest capital to complete and get profit from it 
        Arrays.sort(projects, (a, b) -> a[0] - b[0]);
        // create pq and reverse it to get the maximum profit on top
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // 
        int i = 0;
        while(k-- > 0) {
            // while i < profits.length that is run while loop from starting of projects to last n and see if projects[i][0] is less than or equal to w that is current projects capital is less capital than what we have at w initially we can add that profit in pq
            while(i < n && projects[i][0] <= w) {
                pq.add(projects[i][1]);
                i++;
            }
            // if after upper while loop pq is empty that is we dont get any project whose capital is lower than w then break
            if(pq.isEmpty()) {
                break;
            }
            // get profit in decreasing order that is biggest profit first until k is 0 by popping out elements from pq and add them to w
            w += pq.poll();
        }
        return w;
    }
}