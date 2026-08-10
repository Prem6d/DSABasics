class Solution {
    public void moveZeroes(int[] nums) {
     int i = 0 , j = 0; int temp;
    while(i < nums.length){
        if(nums[i]==0){
        }
        else{
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
        i++;

    }
}
}
