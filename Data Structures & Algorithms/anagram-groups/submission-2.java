class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp= new HashMap<>();
        for(String s:strs){
            String sorted = Stream.of(s.split(""))
                              .sorted()
                              .collect(Collectors.joining());
            if(mp.containsKey(sorted)){
                mp.get(sorted).add(s);
            }else{
                mp.put(sorted,new ArrayList(){{add(s);}});
            }
        }

        return new ArrayList<>(mp.values());
    }
}
