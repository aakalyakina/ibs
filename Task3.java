import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int [] nums = new int[] {5, 8, 2, 4, 1};

        int length = nums.length;
        System.out.println("Original Array: "+ Arrays.toString(nums));
        int x = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = x;
        System.out.println("New array after swaping the first and last elements: "+ Arrays.toString(nums));

        System.out.println(nums[0]+nums[2]);
    }

}
