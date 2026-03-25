class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        List<Integer>[] bucket = new List[n+1];

        for(Map.Entry<Integer, Integer> e:freq.entrySet()){
            if(bucket[e.getValue()] == null)
            bucket[e.getValue()] = new ArrayList<>();
            bucket[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int count=0;
        for(int i=n; i>=0 && count<k; i--){
            if(bucket[i] != null){
                for(int num:bucket[i]){
                    res[count++] = num;
                    if(count >= k) break;
                }
            }
        }

        return res;
    }
}