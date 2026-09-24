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
        for(String str : strs){
            String keyCode = getCode(str);
            if(strsHash.containsKey(keyCode)){
                strsHash.get(keyCode).addLast(str);
            }else{
                List<String> list = new ArrayList<>();
                list.addLast(str);
                strsHash.put(keyCode,list);
            }
        }
        for(List s : strsHash.values()){
            ans.add(s);
        }
        return ans;
    }
}
