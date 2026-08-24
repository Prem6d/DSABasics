class Solution {
    public int missingNumber(int[] nums) {

        boolean[] ar = new boolean[nums.length+1];

        for(int i = 0 ; i < nums.length ; i++){
            ar[nums[i]] = true;
        }

        for(int j = 0 ; j < ar.length; j++){
            if(ar[j] == false){
                return j;
            }
        }

        return 0;
        
    }
}
