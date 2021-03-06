public class MinimumSumOfFourDigitNumberAfterSplittingDigits {
    public int minimumSum(int num) {
        int ar[] = new int[4];
        int i = 0;
        while (num > 0) {
            ar[i++] = num % 10;
            num = num / 10;
        }
        Arrays.sort(ar);
        return (ar[0] * 10 + ar[3]) + (ar[1] * 10 + ar[2]);
    }
}