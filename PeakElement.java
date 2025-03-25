public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 3, 1}; // Example array
        int peakIndex = findPeakElement(nums);
        System.out.println("The peak element index is: " + peakIndex);
        System.out.println("The peak element is: " + nums[peakIndex]);
    }
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
//output
// The peak element index is: 2
//The peak element is: 20