class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i], 0)+1);
        }
        Map.Entry<Integer, Integer> maxEntry = hm.entrySet().stream().max(Map.Entry.comparingByValue())
    .orElse(null);
        Optional<Integer> max = hm.values().stream().max(Integer::compare);

        return maxEntry.getKey();
    }
}
