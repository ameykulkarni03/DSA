class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long element = 1;
        ans.add((int) element);
        for (int i = 0; i < rowIndex; i++) {
            element = element * (rowIndex - i);
            element = element / (i + 1);
            ans.add((int) element);
        }
        return ans;
    }
}