class MedianFinder {
    // TC : O(KlogN) // SC : O(K)
    PriorityQueue<Integer> maxheap = null;
    PriorityQueue<Integer> minheap = null;
    public MedianFinder() {
        maxheap = new PriorityQueue<>((a,b) -> b-a);
        minheap = new PriorityQueue<>((a,b) -> a-b);        
    }
    
    public void addNum(int num) {
        if(maxheap.size() == 0 || maxheap.peek() >= num) {
            maxheap.add(num);
        }
        else{
            minheap.add(num);
        }
        balance();
    }
    
    public double findMedian() {
        if(maxheap.size() > minheap.size()) {
            return maxheap.peek();
        }
        else if(minheap.size() > maxheap.size()) {
            return minheap.peek();
        }
        else {
            return (maxheap.peek() + minheap.peek())/2.0;
        }
    }
    private void balance() {
        if(maxheap.size() - minheap.size() > 1) {
            minheap.add(maxheap.poll());
        }
        else if(minheap.size() - maxheap.size() > 1) {
            maxheap.add(minheap.poll());
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */