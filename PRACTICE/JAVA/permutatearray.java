
import java.util.ArrayList;
import java.util.List;

public class permutatearray {
    public static void permutate(int[] nums, int l, int r, List<int[]> ans) {
        if (l == r) {
            ans.add(nums.clone());
        } else {
            for (int i = l; i < r; i++) {
                swap(nums, l, i);
                permutate(nums, l + 1, r, ans);
                swap(nums, l, i);
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<int[]> ans = new ArrayList<>();
        permutate(nums, 0, nums.length, ans);
        for (int[] arr : ans) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}