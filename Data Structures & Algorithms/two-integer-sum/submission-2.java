class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> store = new HashMap<>();
        int needed;
        for(int i=0;i<nums.length;i++){
         needed = target - nums[i];
         Integer j = store.get(needed);
         if(j==null){
            store.put(nums[i],i);
         } else{
            return new int[] {j,i};
         }  
        }
            return new int[]{};
    }
}
