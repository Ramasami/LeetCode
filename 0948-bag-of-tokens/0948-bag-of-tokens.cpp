class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        sort(tokens.begin(),tokens.end());
        int l = 0;
        int r = tokens.size()-1;
        int score = 0;
        while(l<=r) {
            while(l<=r && tokens[l]<=power) {
                power-=tokens[l];
                l++;
                score++;
                cout<<"@"<<l<<" "<<r<<" "<<score<<" "<<power<<"\n";
            }
            if(score!=0&&l<r && tokens[r] >= tokens[l]) {
                power+=tokens[r];
                r--;
                score--;
                cout<<"#"<<l<<" "<<r<<" "<<score<<" "<<power<<"\n";
            } else
                break;
        }
        return score;
    }
};