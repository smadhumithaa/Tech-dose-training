#include<stdio.h>
#include<conio.h>
void m2s2(int a[],int low,int mid,int high){
        int i = low,j=mid+1;
	    int m[high+1];
	    int k = low;
	    while(i<=mid && j<=high)
	    {
	        if(a[i] > a[j])
	        {
	            m[k++] = a[j];
	            j++;
	        }
	        else{
	            m[k++] = a[i];
	            i++;
	        }
	    }
	    while(i<=mid)
	    {
	        m[k++] = a[i++];
	    }
	    while(j<=high)
	    {
	        m[k++] = a[j++];
	    }
	    
	    for(int index=low;index<=high;index++)
	    {
	        a[index] = m[index];
	    }
}
void ms(int arr[],int low,int high){
  if(low==high)
    return;
  int mid=low+((high-low)/2);
  ms(arr,low,mid);
  ms(arr,mid+1,high);
  m2s2(arr,low,mid,high);
}

int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  ms(arr,0,n-1);
  for(int i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
}
