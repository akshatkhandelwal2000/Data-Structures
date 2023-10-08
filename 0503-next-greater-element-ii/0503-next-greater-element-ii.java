class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // TC : O(N) // SC : O(N)
        // Stack<Integer> st = new Stack<>();
        // int n = nums.length;
        // int[] ans = new int[n];
        // for(int i = 2*n-1; i >= 0; i--) {
        //     while(!st.isEmpty() && st.peek() <= nums[i%n]) {
        //         st.pop();
        //     }
        //     if(i < n) {
        //         if(!st.isEmpty()) {
        //         ans[i] = st.peek();
        //         }
        //         else {
        //         ans[i] = -1;
        //         }
        //     }
        //     st.push(nums[i%n]);
        // }
        // return ans;
        // TC : O(N^2) // SC : O(N)
           Stack<Integer> st = new Stack<>();
           int[] ans = new int[nums.length];
           Arrays.fill(ans, -1);
           for(int i = nums.length-1; i >= 0; i--) {
               int ele = nums[i];
               while(!st.isEmpty() && st.peek() <= ele) {
                   st.pop();
               }
               if(!st.isEmpty()) {
                   ans[i] = st.peek();
               }
               else {
                   for(int j = 0; j < nums.length; j++) {
                       if(nums[j] > ele) {
                           ans[i] = nums[j];
                           break;
                       }
                   }
               }
               st.push(ele);
           }
           return ans;
    }
}