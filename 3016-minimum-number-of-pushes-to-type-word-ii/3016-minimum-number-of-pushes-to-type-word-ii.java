class Solution {
    public int minimumPushes(String word) {
        // TC : O(N) // SC : O(1)
        int n = word.length();
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            arr[word.charAt(i)-'a']++;
        }
        Arrays.sort(arr);
        int in = 1;
        int ans = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            if(in <= 8) {
                ans = ans+(arr[i]*1);
            }
            else if(in <= 16) {
                ans = ans+(arr[i]*2);
            }
            else if(in <= 24) {
                ans = ans+(arr[i]*3);
            }
            else if(in > 24) {
                ans = ans+(arr[i]*4);
            }
            in++;
        }
        return ans;
    }
}