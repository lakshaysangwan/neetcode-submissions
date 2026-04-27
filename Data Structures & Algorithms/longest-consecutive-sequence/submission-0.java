class Solution {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        int result = 0;
        for (Integer i : hs) {
            int current = 1;
            if (hs.contains(i - 1)) continue;
            while (hs.contains(i + 1)) {
                current++;
                i++;
            }
            if (current > result) result = current;
        }
        return result;
    }
}
