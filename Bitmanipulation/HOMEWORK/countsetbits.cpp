int countSetBits(int n){
    return __builtin_popcount(N);
}
int main(){
    int n; 
    cin >> n;
    cout << countSetBits(n) << endl;
    return 0;
}
