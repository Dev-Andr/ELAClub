public class Bubble {
    public static void main(String[] args) {
        int nums[] = { 5, 1, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 6, 5, 1, 4, 2, 6 };

        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length - i - 1; j++)
                if (nums[j] > nums[j + 1]) {
                    int a = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = a;
                }

        System.out.println("after sorting");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
