
public class prwithrepeat {
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }

    static int findSmallerInRight(String str, int low, int high) {
        int countRight = 0, i;
        for (i = low + 1; i <= high; i++)
            if (str.charAt(i) < str.charAt(low)) {
                countRight++;
            }
        return countRight;
    }

    static int findRank(String str) {
        int len = str.length();
        int mul = fact(len);
        int rank = 1;
        int countRight;
        for (int i = 0; i < len; i++) {
            mul /= len - i;// m=2
            countRight = findSmallerInRight(str, i, len - 1);
            rank += countRight * mul;
        }
        return rank;
    }

    public static void main(String[] args) {
        String str = "bca";
        System.out.println(findRank(str));
    }
}
