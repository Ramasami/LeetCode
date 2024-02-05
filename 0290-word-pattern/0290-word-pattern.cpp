class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> patternMap;
        unordered_map<string, char> keyMap;
        int sn = s.length();
        int pn = pattern.length();
        string sb = "";
        int j = 0;
        for(int i=0;i<sn;i++) {
            char c = s[i];
            if (c == ' ') {
                string key = sb;
                sb = "";
                char pc = pattern[j++];
                if (j==pattern.length())
                    return false;
                if(
                    patternMap.find(pc) != patternMap.end() && 
                   (
                       keyMap.find(key) == keyMap.end() 
                       || patternMap[pc]!=key 
                       || keyMap[key]!=pc
                   )
                  ) 
                    return false;
                else {
                    patternMap[pc] = key;
                    keyMap[key] = pc;
                }
            } else {
                sb+=c;
            }
        }
        string key = sb;
        char pc = pattern[j++];
        return j == pattern.length()
            && (
            (
                patternMap.find(pc) != patternMap.end()
                && keyMap.find(key) != keyMap.end()
                && patternMap[pc] == key 
                && keyMap[key] == pc
           ) 
        || (
                patternMap.find(pc) == patternMap.end()
                && keyMap.find(key) == keyMap.end()
               )
        );
    }
};