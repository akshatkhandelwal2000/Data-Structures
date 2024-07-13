class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        // TC : O(N) + O(NlogN) // SC : O(N) + O(N)
        int n = positions.length;
        int[][] arr = new int[n][3];
        for(int i = 0; i < n; i++) {
            arr[i][0] = positions[i];
            arr[i][1] = healths[i];
            arr[i][2] = i;
        }
        Map<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            map.put(positions[i], directions.charAt(i));
        }
        Arrays.sort(arr, (a,b) -> a[0]-b[0]);
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while(i < n) {
            if(!st.isEmpty() && map.get(arr[i][0]) == 'L' && map.get(arr[st.peek()][0]) == 'R') {
                if(arr[i][1] == arr[st.peek()][1]) {
                    st.pop();
                    i++;
                    continue;
                }
                else if(arr[i][1] > arr[st.peek()][1]) {
                    arr[i][1] -= 1;
                    st.pop();
                    continue;
                }
                else {
                    arr[st.peek()][1] -= 1;
                    i++;
                    continue;
                }
            }
            else {
                st.push(i);
            }
            i++;
        }
        List<int[]> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        while(!st.isEmpty()) {
            list.add(arr[st.pop()]);
        }
        list.sort(Comparator.comparingInt(a -> a[2]));
        for(int[] l : list) {
            ans.add(l[1]);
        }
        return ans;
    }
}