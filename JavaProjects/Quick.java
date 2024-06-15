public class Quick {

    public static void qSort(int[] nums, int low, int high) {
        if (low<high){
            int pi = partition(nums,low,high);

            qSort(nums, 0, pi-1);
            qSort(nums, pi+1, high);
        }
    }

    private static int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i = low - 1;

        for(int j = low; j<high;j++){
            if(nums[j]<pivot){
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];
        nums[i+1] = nums[high];
        nums[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 1, 4, 2, 6 };
        int size = nums.length;
        
        qSort(nums, 0, nums.length-1);

        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}