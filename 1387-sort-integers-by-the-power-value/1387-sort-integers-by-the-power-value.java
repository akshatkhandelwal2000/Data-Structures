class Solution {
    public int getKth(int lo, int hi, int k) {
        // TC : O(NlogN) // SC : O(N)
        List<int[]> list = new ArrayList<>();
        for(int i = lo; i <= hi; i++) {
            int a = 0;
            int b = i;
            while(b > 1) {
                if(b%2 == 0) {
                    b = b/2;
                }
                else {
                    b = 3*b+1;
                }
                a++;
            }
            list.add(new int[]{i, a});
        }
        Collections.sort(list, (a,b) -> a[1] == b[1] ? a[0]-b[0] : a[1]-b[1]);
        int ans = list.get(k-1)[0];
        return ans;
    }
}