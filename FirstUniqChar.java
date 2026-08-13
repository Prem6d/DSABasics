class Solution {
    public int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < ch.length; i++){
            hm.put(ch[i], hm.getOrDefault(ch[i],0)+1);

        }
        for(int i = 0 ; i < ch.length; i++){
            if(hm.get(ch[i])==1)
            return i;
        }
        return -1;

        
    }
}
