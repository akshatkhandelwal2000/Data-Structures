class Solution {
    public List<String> removeSubfolders(String[] folder) {
        // TC : O(N) // SC : O(N)
        int n = folder.length;
        List<String> ans = new ArrayList<>();
        Arrays.sort(folder);
        ans.add(folder[0]);
        for(int i = 1; i < n; i++) {
            String str = ans.get(ans.size()-1); 
            str += "/";
            if(!folder[i].startsWith(str)) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}