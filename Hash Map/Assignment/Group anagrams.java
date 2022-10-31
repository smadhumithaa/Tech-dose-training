class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=String.valueOf(ch);
            if(!mp.containsKey(st)){
                mp.put(st,new ArrayList<>());
            }
            mp.get(st).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
