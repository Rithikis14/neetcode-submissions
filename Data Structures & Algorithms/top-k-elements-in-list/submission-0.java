class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int []res=new int[k];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        //int i=1
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        pq.offer(entry);
        if(pq.size()>k) pq.poll();
        }
        for(int i=0;i<k;i++){ 
        int m=pq.poll().getKey();
        res[i]=m;
        }
        return res;
    }
}