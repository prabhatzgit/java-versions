package jdk8.streamapi;

public class FindPivot {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 6, 9, 5, 7};
        int n = nums.length;

        int low = 0, high = n - 1;
        int left = 0, right = 0;

        int mid = (low + high) / 2;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < nums[mid]) {

                left += nums[i];
                left++;
                continue;
            } else {

                right += nums[i];
                right--;

            }

            if (left == right) {
                System.out.println("pivot element is : " + nums[i]);
                System.out.println("pivot element is : " + left);
                System.out.println("pivot element is : " + right);
            }

        }
    }
}
