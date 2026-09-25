class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new ArrayList[nums.length+1];
        System.out.println(nums.length);
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] ans = new int[k];
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num, 0)+1);
        }
        for(int key : freq.keySet()){
            int index = freq.get(key);
            if(bucket[index] == null){
                bucket[index] = new ArrayList<>();
            }
            bucket[index].add(key);
        }
        int count = 0;
        for(int i=bucket.length-1;i>=0 && count<k;i--){
            if(bucket[i] != null){
                for(int num : bucket[i]){
                    ans[count] = num;
                    count++;
                }
            }
        }
        return ans;
    }
}
