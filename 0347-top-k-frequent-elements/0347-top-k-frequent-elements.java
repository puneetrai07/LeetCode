class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer, Integer> freq = new HashMap<>();
        int[] res = new int[k];

        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue <>(
            (a, b) -> freq.get(a) - freq.get(b)
        );

        for(int num: freq.keySet()){
            pq.offer(num);
            if(pq.size() > k)
            pq.poll();
        }
        int i=0;
        while(pq.size() != 0)
        res[i++] = pq.poll();

        return res;
    }
}