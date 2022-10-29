class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int curr=0;
        char ch='+';
        char[] arr=s.toCharArray();
        if(s==null || s.length()==0)
            return 0;
        for(int i=0;i<arr.length;i++){
            if(Character.isDigit(arr[i]))
                curr=curr*10+arr[i]-'0';
            if(!Character.isDigit(arr[i]) && arr[i]!=' ' || i==arr.length-1){
                if(ch=='+')
                    st.push(curr);
                else if(ch=='-')
                    st.push(-curr);
                else if(ch=='*')
                    st.push(st.pop()*curr);
                else if(ch=='/')
                    st.push(st.pop()/curr);
                ch=arr[i];
                curr=0;
                                                                            }
                
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
            return sum;
               }
        
}
