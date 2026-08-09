class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String> > list = new HashMap<>();
        for( String word : strs){
            char [] chars =word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            list.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(list.values());
    }
}
