class Solution {
public:
    int pivotInteger(int n) {
        int a = n * n + n;
        if (a%2==1)
            return -1;
        int pivot = sqrt(a/2);
        return pivot * pivot == a / 2? pivot:-1;
    }
};