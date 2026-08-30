class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String k=s.replaceAll("[^a-z0-9]","");
        // k.toLowerCase();
        int l=0;
        int r=k.length()-1;
        while(l<=r){
            if(k.charAt(l)!=k.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
