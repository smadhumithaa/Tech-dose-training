#include <bits/stdc++.h>
using namespace std;
vector <int> arr;
void input(int val)
{
  arr.push_back(val);
  for(int i=arr.size()-1;i>0;--i)
  {
    if(arr[i]>=arr[i-1])
      break;
    int temp=arr[i];
    arr[i]=arr[i-1];
    arr[i-1]=temp;
  }
}
  
int main() 
{ 
    int n;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    int x=0;
    cin>>x;
    input(x);
  }
  for(int i=0;i<n;i++){
      cout<<arr[i];
  }
}
  
