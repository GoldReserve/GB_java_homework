class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        combineR(n, k, 1, new ArrayList<>());
        return ans;
    }
    private void combineR(int n, int k, int index, List<Integer> list) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i <= n; i++) {
            list.add(i);
            combineR(n, k, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
