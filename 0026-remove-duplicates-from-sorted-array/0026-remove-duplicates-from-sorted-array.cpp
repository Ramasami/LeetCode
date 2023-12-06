class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int visited[201] = {0};
        int l = 0;
        for (int i=0;i<nums.size();i++) {
            if(visited[nums[i]+100] == 0) {
                visited[nums[i]+100] = 1;
                nums[l++] = nums[i];
            } 
        }
        return l;
    }
};