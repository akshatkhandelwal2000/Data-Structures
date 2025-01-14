class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        // TC : O(N^2) // SC : O(N)
        int n = A.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            Set<Integer> a = new HashSet<>();
            Set<Integer> b = new HashSet<>();
            int c = 0;
            for(int j = i; j >= 0; j--) {
                a.add(A[j]);
                b.add(B[j]);
            }
            for(int k : a) {
                if(b.contains(k)) {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}