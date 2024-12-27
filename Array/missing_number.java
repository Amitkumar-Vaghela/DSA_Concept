class Solution {
    public static int missingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2; // Sum of numbers from 0 to n
        int actualSum = 0;

        // Calculate the sum of elements in the array using a simple for loop
        for (int i = 0; i < nums.length; i++) {
            actualSum += nums[i];
        }

        // Missing number is the difference
        return expectedSum - actualSum;
    }

public class Runner {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int n = 3; // Length of the original range [0, n]

        // Call the method with two arguments
        int missing = Solution.missingNumber(nums, n);

        System.out.println("Missing Number: " + missing); // Output: 2
    }
}


  
}
