class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int[] temp = new int[set.size()];
        int ind = 0;
        for(int e : set) {
            temp[ind++] = e;
        }
        Arrays.sort(temp);
        int j = 0;
        for(int i = 0; i < temp.length; i++) {
            while(j < temp.length && temp[j] < temp[i]+n) {
                j++;
            }
            int count = j - i;
            res = Math.min(res, n - count);
        }
        return res;
    }
}