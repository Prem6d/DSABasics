class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int comp = 0;

        for(int i = 0 ; i < nums.length ; i++){
            comp = target - nums[i];

            if(hm.containsKey(nums[i])){
                return new int[]{i,hm.get(nums[i])};
            }
           hm.put(comp,i);

        }

        return new int[]{-1, -1};
      
     
}}
