class Solution {
    public int[] decrypt(int[] code, int k) {
        // TC : O(N*K) // SC : O(N)
        int n = code.length;
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            if(k > 0) {
                int abs = k; 
                int j = i+1;
                int sum = 0;
                while(abs-- > 0) {
                    sum += code[j%n];
                    j++;
                }
                ans[i] = sum;
            }
            else if(k < 0) {
                int abs = Math.abs(k);
                int j = i-1;
                int sum = 0;
                while(abs-- > 0) {
                    if(j < 0) {
                        j = n-1;
                    }
                    sum += code[Math.abs(j)%n];
                    j--;
                }
                ans[i] = sum;
            }
        }
        return ans;
    }
}