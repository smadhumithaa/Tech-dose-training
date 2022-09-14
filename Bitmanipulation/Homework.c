
#include <stdio.h>
#include<conio.h>
int setIthBit(int N, int pos){
    return N | ( 1 << (pos-1) );
}
int main(){
    int N, pos;
    scanf("%d%d",&n,&pos);
    printf("%d",setIthBit(n,pos);
    return 0;
}
