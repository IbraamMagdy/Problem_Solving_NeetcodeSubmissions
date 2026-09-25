class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int[] ans = new int[k];
        for(int num : nums){
            if(freq.containsKey(num)){
                freq.put(num, freq.get(num) + 1);
                freq.get(num);  
            }else{
                freq.put(num, 1);
            }
        }
        
        for(int  i=0;i<k;i++){
            int maxvalue=0,keyOfMaxvalue=0;
            for(int key : freq.keySet()){
                int f=freq.get(key);
                if(maxvalue<f){
                    maxvalue=f;
                    keyOfMaxvalue=key;
                }
            }
            ans[i] = keyOfMaxvalue;
            freq.put(keyOfMaxvalue, 0);
        }
        return ans;
    }
}
