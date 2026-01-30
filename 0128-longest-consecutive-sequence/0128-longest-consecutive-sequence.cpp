class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set <int> st;
        int count=0;

        for(int i:nums){
            st.insert(i);
        }

        for(int i:st){
            if(st.find(i-1)==st.end()){
                int temp=0;
                int j=i;
                while(st.find(j)!=st.end()){
                    temp++;
                    j++;
                }
                count=max(temp,count);
            }
        }

        return count;
    }
};