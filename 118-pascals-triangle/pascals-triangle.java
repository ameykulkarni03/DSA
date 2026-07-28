class Solution {

    static List<Integer> generateRow (int row) {
        List<Integer> ansArr = new ArrayList<>();
        int ans = 1;
        ansArr.add(ans);
        for (int i = 0; i < row; i++) {
            ans = ans * (row - i);
            ans = ans / (i + 1);
            ansArr.add(ans);
        }
        return ansArr;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ans.add(generateRow(i));
        } 
        return ans;
    }
}