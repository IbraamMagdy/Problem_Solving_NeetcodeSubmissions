class Solution {
    public String getCode(String s){
        int[] alph = new int[26];
        for(char c : s.toCharArray()){
            alph[c - 'a']++;
        }
        String keyCode = Arrays.toString(alph);
        return keyCode;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> strsHash = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String keyCode = getCode(strs[i]);
            if(strsHash.containsKey(keyCode)){
                strsHash.get(keyCode).addLast(strs[i]);
            }else{
                List<String> list = new ArrayList<>();
                list.addLast(strs[i]);
                strsHash.put(keyCode,list);
            }
        }
        for(List s : strsHash.values()){
            ans.add(s);
        }
        return ans;
    }
}
