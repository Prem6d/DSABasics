import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Deque<Integer> monstack = new ArrayDeque<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[nums1.length];


        for(int current : nums2){

         while(!monstack.isEmpty() && current > monstack.peek() ){
            int element = monstack.pop();
            hm.put(element, current);

         }

         monstack.push(current);

        }

         while(!monstack.isEmpty()){
            hm.put(monstack.pop(), -1);
         }

        for(int i = 0 ; i < nums1.length ; i++){
            res[i] = hm.get(nums1[i]);
         }

        return res;
 
    
}
}
