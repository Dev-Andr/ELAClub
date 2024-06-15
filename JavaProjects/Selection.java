public class Selection {
    public static void main(String[] args) {
        int nums[] = { 5, 1, 4, 2, 6};
        int size = nums.length, mI = -1;

        for (int i = 0; i<size-1; i++){
            mI = i;
            for (int j = i+1; j<size; j++){
                if (nums[mI] > nums[j]){
                    mI = j;
                }
            }
            int a = nums[mI];
            nums[mI] = nums[i];
            nums[i] = a;
        }



        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
