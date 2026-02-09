class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;

        int n=nums.size();

        for(int i=0; i<n; i++){
            int l=i+1, r=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;

            while(l<r){
                int tempSum = nums[i]+nums[l]+nums[r];
                if(0 == tempSum){
                    ans.push_back({nums[i], nums[l], nums[r]});
                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }

                else if(0 > tempSum) l++;
                else r--;
            }
        }
        return ans;
    }
};