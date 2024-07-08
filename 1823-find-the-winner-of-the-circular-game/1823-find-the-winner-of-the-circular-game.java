class Solution {
    public int findTheWinner(int n, int k) {
        k = k%n;
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) q.offer(i);
        while(q.size() != 1) {
            int t = 1;
            while(t <= k-1) {
                int i = q.poll();
                q.offer(i);
                t++;
            }
            q.poll();
        }
        return q.poll();
    }
}