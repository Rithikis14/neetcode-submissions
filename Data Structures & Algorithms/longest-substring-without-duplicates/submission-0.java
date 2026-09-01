class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int ml=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            while(!set.add(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }  
            //int l=set.size();
            if(ml<i-l+1) ml=i-l+1;
        }
        return ml;
    }
}
