class Solution {
    
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int cnt = 0;
        for (int num: nums1) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (int num: nums2) {
            frequency.put(num, frequency.getOrDefault(num, 0) - 1);
            if (frequency.get(num) >= 0) {
                res.add(num);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
