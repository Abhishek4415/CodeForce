public class longestsubarray {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 2, 7, 1, -10 };
        int k = 15;
        int left = 0;
        int sum = 0;
        int maxlen = 0;
        for (int R = 0; R < arr.length; R++) {
            sum += arr[R];

            if (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {

                maxlen = Math.max(maxlen, R - left + 1);
            }

        }

        System.out.println(maxlen);

    }
}