class SeatManager {
    PriorityQueue<Integer> heap;
    // TC : O(N*logN) // SC : O(N)
    public SeatManager(int n) {
        heap = new PriorityQueue<>();
        for(int i = 1; i <= n; i++) {
            heap.add(i);
        }
    }
    // TC : O(logN)
    public int reserve() {
        int num = 0;
        if(heap.size() != 0) {
             num = heap.poll();
        }
        return num;
    }
    // TC : O(logN)
    public void unreserve(int seatNumber) {
        heap.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */