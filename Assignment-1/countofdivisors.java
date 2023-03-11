
public class Main {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5 };
        int ans[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 1; j <= arr[i] / 2; j++) {
                if (arr[i] % j == 0) {
                    count++;
                }
            }
            ans[i] = count + 1;
        }
        for (int i : ans) {
            System.out.print(i + " ");

        }
    }
}
