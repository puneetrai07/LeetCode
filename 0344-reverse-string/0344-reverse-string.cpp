class Solution {
public:

    void reverse(int i, int j, vector<char>& s){
        if(i > j)
        return;
        swap(s[i], s[j]);
        reverse(i+1, j-1, s);
    }

    void reverseString(vector<char>& s) {
        int n=s.size();
        int i=0, j=n-1;
        reverse(i, j, s);
    }
};