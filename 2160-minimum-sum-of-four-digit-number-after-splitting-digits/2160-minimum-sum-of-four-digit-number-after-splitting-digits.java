class Solution {
    public int minimumSum(int num) {
        // TC : O(N) // SC : O(1)
        List<Integer> list = new ArrayList<>();
        while(num != 0) {
            list.add(num%10);
            num = num/10;
        }
        Collections.sort(list);
        int a = list.get(0)*10+list.get(list.size()-1);
        int b = list.get(1)*10+list.get(list.size()-2);
        return a+b;
    }
}