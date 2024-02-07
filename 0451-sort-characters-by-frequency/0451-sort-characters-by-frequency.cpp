class Solution {
public:
    string frequencySort(string s) {
        int a[62];
        int n = s.length();
        for(int i=0;i<n;i++) {
            char c = s[i];
            if (c >= 'a' && c<='z') {
                a[c-'a']++;
            } else if (c >= 'A' && c<='Z'){
                a[c-'A'+26]++;
            } else {
                a[c-'0'+52]++;
            }
        }
        auto comp = [](const int& a, const int& b) { return a > b; };
        map<int, vector<char>, decltype(comp)> m;
        for(int i=0;i<26;i++) {
            if(m.find(a[i]) == m.end())
                m[a[i]] = vector<char>();
            m[a[i]].push_back((char)(i+'a'));
        }
        for(int i=26;i<52;i++) {
            if(m.find(a[i]) == m.end())
                m[a[i]] = vector<char>();
            m[a[i]].push_back((char)(i-26+'A'));
        }
        for(int i=52;i<62;i++) {
            if(m.find(a[i]) == m.end())
                m[a[i]] = vector<char>();
            m[a[i]].push_back((char)(i-52+'0'));
        }
        string sb = "";
        for(auto it1 = m.begin();it1!=m.end();it1++) {
            auto l = it1->second;
            int n = it1->first;
            for(auto it2 = l.begin();it2!=l.end();it2++) {
                for(int i=0;i<n;i++)
                    sb+=(*it2);
            }
        }
        return sb;
    }
};

