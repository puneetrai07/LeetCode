class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        bool row[9][9];
        bool col[9][9];
        bool boxes[9][9];

        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){

                if(board[r][c]=='.')
                continue;

                int num=board[r][c]-'1';
                int box=(r/3)*3+(c/3);

                if(row[r][num] || col[c][num] || boxes[box][num])
                return false;

                row[r][num]=true;
                col[c][num]=true;
                boxes[box][num]=true;
            }
        }

        return true;
    }
};