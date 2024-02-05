class Solution {
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> nextPossibleStates = new ArrayList<>();
        for (int index = 0; index < currentState.length() - 1; ++index) {
            if (currentState.charAt(index) == '+' && currentState.charAt(index + 1) == '+') {
                String nextState = (currentState.substring(0, index) + "--" + currentState.substring(index + 2));
                nextPossibleStates.add(nextState);
            }
        }
        return nextPossibleStates;
    }
}