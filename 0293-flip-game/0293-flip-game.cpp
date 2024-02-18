class Solution {
public:
    vector<string> generatePossibleNextMoves(string currentState) {
        vector<string> nextPossibleStates;
        for (int index = 0; index < currentState.size() - 1; ++index) {
            if (currentState[index] == '+' and currentState[index + 1] == '+') {
                string nextState = (currentState.substr(0, index) + "--" + currentState.substr(index + 2));
                nextPossibleStates.push_back(nextState);
            }
        }
        return nextPossibleStates;
    }
};