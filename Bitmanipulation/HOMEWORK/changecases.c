#include<stdio.h>
#include<conio.h>

char toLower(char ch){
    return ch | (1<<5);
}

char toUpper(char ch){
    return ch & ( ~(1<<5) );
}

char toToggle(char ch){
    return ch ^ (1<<5);
}

int main(){
    char ch;
    scanf("%c",&ch);
    print("%c\n",toLower(ch));
    print("%c\n",toUpper(ch));
    printf("%c\n",toToggle(ch));
    return 0;
}
