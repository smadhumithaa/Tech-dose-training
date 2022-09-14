class Solution {
    public int myAtoi(String s) {
        long num=0;
        s=s.trim();
        int lead=0;
        if(s.charAt(lead)=='-'|| s.charAt(lead)=='+'){
            lead++;
        }
        while(lead<s.length()){
            if(s.charAt(lead)=='0')
                lead++;
        
        else{
            break;
        }
        }
        for(int i=lead;i<lead+11 && i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                System.out.println(s.charAt(i)-'0');
                num=num*10+(s.charAt(i)-'0');
                //System.out.println(num);
            }
        }
        if(s.charAt(0)=='-'){
            num=-num;
        }
        if(num>2147483647){
            return 2147483647;
        }
        if(num<-2147483648){
            return -2147483648;
        }
        
        return (int)num;
        
    }
}
