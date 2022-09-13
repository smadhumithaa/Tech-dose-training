

#include <bits/stdc++.h>
using namespace std;
//calculate mean
double mean(int arr[], int size){
   int sum = 0;
   for (int i = 0; i < size; i++)
      sum += arr[i];
   return (double)sum/(double)size;
}
//calculate median
double median(int arr[], int size){
   sort(arr, arr+size);
   if (size % 2 != 0)
      return (double)arr[size/2];
   return (double)(arr[(size-1)/2] + arr[size/2])/2.0;
}
int mode(int arr[],int n){
  for(i=0;i<n;i++) {
        count = 0;
        for(j=0;j<n;j++) {
            if(arr[i] == arr[j]) {
                count++;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            maxVal = arr[i];
         }
    }
  return maxVal;
}
int main(){
   int arr[] = {3,5,2,1,7,8};
   int size = sizeof(arr)/sizeof(arr[0]);
   cout << "Mean is : " << mean(arr, size)<<endl;
   cout << "Median is : " << median(arr, size) << endl;
   cout <<"Mode is : " << mode(arr,size) << endl;
   return 0;
}
