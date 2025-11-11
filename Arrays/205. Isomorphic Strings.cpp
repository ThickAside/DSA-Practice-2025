class Solution {
    public boolean isIsomorphic(String s, String t) {
    if (s.length()!=t.length())
    return false;

    Map<Character , Character> charmap = new HashMap<>();       

    for(int i=0;i<s.length();i++){
        char original = s.charAt(i);
        char replace = t.charAt(i);

        if (!charmap.containsKey(original)){
            if (!charmap.containsValue(replace))
            charmap.put(original,replace);
            else 
            return false;
        } 
        else {
            char mapped = charmap.get(original);
            if (mapped!=replace)
            return false;
        }
    } 
    return true;
    }
}
