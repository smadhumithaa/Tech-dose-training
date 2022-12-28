class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> res=new LinkedList<>();
        if(digits.length()==0) return res;
        res.add("");
        String[] arr=new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i=0;i<digits.length();i++){
            int c=Character.getNumericValue(digits.charAt(i));
            while(res.peek().length()==i){
                String per=res.remove();
                for(char ch:arr[c].toCharArray()){
                    res.add(per+ch);
                }
            }
        }
        return res;
    }
}
