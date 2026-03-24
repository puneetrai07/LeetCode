class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> freq = new HashMap<>();

        for(String str:strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            freq.putIfAbsent(key, new ArrayList<>());
            freq.get(key).add(str);
        }
        return new ArrayList<>(freq.values());
    }
}