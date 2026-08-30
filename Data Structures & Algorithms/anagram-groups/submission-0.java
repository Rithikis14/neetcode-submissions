class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char []S=s.toCharArray();
            Arrays.sort(S);
            String k=String.valueOf(S);
            map.putIfAbsent(k,new ArrayList<>());
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
