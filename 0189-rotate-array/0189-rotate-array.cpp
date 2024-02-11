class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size();
        k%=n;
        k = n-k;
        if(k==0)
            return;
        int count = 0;
        for(int i=0;count<n;i++) {
            int curr = nums[i];
            int j = i;
            while(true) {
                int nextJ = (j+k)%n;
                count++;
                if(nextJ == i) {
                    nums[j] = curr; 
                    break;
                }
                nums[j] = nums[nextJ];
                j = nextJ;
            }
        }
    }
    int next(int k, int n, int i) {
        return (n + i-k)%n;
    }
    
    void swap(int &a, int &b) {
        int t = a;
        a = b;
        b = t;
    }
    
    int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
};