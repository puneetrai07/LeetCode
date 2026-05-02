class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> freq;
        int count=0;

        for(auto ch:s){
            freq[ch]++;
        }

        for(auto it:freq){
            count += (it.second/2);
        }
        if(count*2 < s.length())
        return count*2 + 1;
        return count*2;
    }
};