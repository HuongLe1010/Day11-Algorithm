package Day11;

public class Sort {
	public static void main(String[] args) {
		int[] nums = {2, 0, 2, 1, 1, 0, 2, 2, 0, 0, 1};
		sort(nums);
		for (int num: nums) {
			System.out.print(num + " ");
		}
	}
	
	public static void sort(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int current = 0;
		
		while (current <= high) {
			if (nums[current] == 0) {
				swap(nums, current, low);
				current++;
				low++;
			} else if (nums[current] == 2) {
				swap(nums, current, high);
				high--;
			} else {
				current++;
			}
		}
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
