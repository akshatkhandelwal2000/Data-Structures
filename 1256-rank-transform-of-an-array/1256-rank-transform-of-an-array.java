class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] rank = new int[n];
        for(int i = 0; i < n; i++) {
            rank[i] = arr[i];
        }
        Arrays.sort(rank);
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;
        for(int i = 0; i < n; i++) {
            if(!map.containsKey(rank[i])) {
                map.put(rank[i], max);
                max++;
            }
        }
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            score[i] = map.get(arr[i]);
        }
        return score;       
    }
}