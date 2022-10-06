class Solution {
public:
    int rangeBitwiseAnd(int left, int right) {
        int sub=right-left;
        int a=left & right;
        for(int i=0;i<=30;i++){
            if(sub/(1<<i)){
                a &= ~(1<<i);
            }
        }
        return a;
    }
};
