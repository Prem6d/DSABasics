class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        int length = 0;
        if(nums1.length<nums2.length){
            length = nums1.length;
        }
        else
        length = nums2.length;
        int[] nums3 = new int[length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                nums3[k] = nums1[i];
                j++; 
                k++;
                i++;

            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else
            j++;

        }
        return Arrays.copyOf(nums3, k);
        
    }
}
