class Solution {
public:
    int maxArea(vector<int>& height) {
        int n=height.size();
        int l=0, r=n-1;
        int ans=0;

        while(l<r){
            int vol=min(height[l],height[r]) * (r-l);
            if(height[l] < height[r])
            l++;
            else
            r--;

            ans =max(ans, vol);
        }
        return ans;
    }
};