class Solution {
public:
    vector<int> decode(vector<int>& encoded) {
            int n=encoded.size();
    int xr=0;
    for(int i=0;i<n;i+=2)
    {
        xr=xr^encoded[i];
    }
	int xr1=0;
    for(int i=1;i<=n+1;i++)
    {
     xr1=xr1^i;
    }
    int last=xr1^xr;
    vector<int>v;
    for(int i=0;i<n+1;i++)
    {
     v.push_back(0);
    }
    n=n+1;
    v[n-1]=last;
    int ind=n-2;
    for(int i=n-2;i>=0;i--)
    {
        v[ind]=v[ind+1]^encoded[i];
        ind--;
    }
    return v;
    }
};
