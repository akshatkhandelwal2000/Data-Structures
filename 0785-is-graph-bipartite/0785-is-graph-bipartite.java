class Solution {
    public boolean isBipartite(int[][] graph) {
        // TC : O(V+2E) + O(M) + O(V+2E) // SC : O(V+2E) + O(M)
        int m = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < m; i++) {
            for(int it : graph[i]) {
                adj.get(i).add(it);
            }
        }
        int[] color = new int[m];
        for(int i = 0; i < m; i++) {
            color[i] = -1;
        }
        for(int i = 0; i < m; i++) {
            if(color[i] == -1) {
                if(dfs(i, 0, color, adj) == false) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, int col, int[] color, List<List<Integer>> adj) {
        color[node] = col;
        for(int it : adj.get(node)) {
            if(color[it] == -1) {
                if(dfs(it, 1-col, color, adj) == false) {
                    return false;
                }
            }
            else if(color[it] == color[node]) return false;
        }
        return true;
    }
}



// class Solution {
//     public boolean isBipartite(int[][] graph) {
//         // TC : O(V+2E) + O(M) + O(V+2E) // SC : O(V+2E) + O(M)
//         int m = graph.length;
//         List<List<Integer>> adj = new ArrayList<>();
//         for(int i = 0; i < m; i++) {
//             adj.add(new ArrayList<>());
//         }
//         for(int i = 0; i < m; i++) {
//             for(int it : graph[i]) {
//                 adj.get(i).add(it);
//             }
//         }
//         int[] color = new int[m];
//         for(int i = 0; i < m; i++) {
//             color[i] = -1;
//         }
//         for(int i = 0; i < m; i++) {
//             if(color[i] == -1) {
//                 if(bfs(i, color, adj) == false) return false;
//             }
//         }
//         return true;
//     }
//     public boolean bfs(int start, int[] color, List<List<Integer>> adj) {
//         Queue<Integer> q = new LinkedList<>();
//         q.offer(start);
//         color[start] = 0;
//         while(!q.isEmpty()) {
//             int node = q.peek();
//             q.poll();
//             for(int it : adj.get(node)) {
//                 if(color[it] == -1) {
//                     color[it] = 1-color[node];
//                     q.add(it);
//                 }
//                 else if(color[it] == color[node]) return false;
//             }
//         }
//         return true;
//     }
// }