class Solution {
    public boolean isAnagram(String s, String t) {
        StringBuilder str = new StringBuilder(t);
        for(char temp : s.toCharArray()){
            int i = str.indexOf(String.valueOf(temp));
            if (i == -1){
                return false;
            }
            str.deleteCharAt(i);
        }
        if(str.length()==0){
            return true;
        }
        return false;
    }
}
