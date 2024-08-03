class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        // TC : O(M+N) // SC : O(N)
        int n = target.length;
        int m = arr.length;
        if(n != m) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(target[i], map.getOrDefault(target[i], 0)+1);
        }
        for(int i = 0; i < m; i++) {
            if(!map.containsKey(arr[i])) return false;
            if(map.get(arr[i]) <= 0) return false;
            map.put(arr[i], map.getOrDefault(arr[i], 0)-1);
        }
        return true;
    }
}