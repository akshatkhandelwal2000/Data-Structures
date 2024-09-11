class Solution {
    public boolean isAcronym(List<String> words, String s) {
        // TC : O(N) // SC : O(100)
        int n = words.size();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(words.get(i).charAt(0));
        }
        return sb.toString().equals(s);
    }
}