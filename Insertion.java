public class Insertion{
    public static void main(String[] args) {
        int nums[] = { 1, 4, 6, 2, 9 };
        int size = nums.length;

        for (int i = 1; i < size; i++) {
            int j = i;
            while (nums[j - 1] > nums[j]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }

        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
