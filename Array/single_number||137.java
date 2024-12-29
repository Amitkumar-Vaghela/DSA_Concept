class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            // Update `ones` to include bits that appear the first time
            ones = (ones ^ num) & ~twos;
            
            // Update `twos` to include bits that appear the second time
            twos = (twos ^ num) & ~ones;
        }

        // The result is the bits that appeared exactly once
        return ones;
    }
}



/*

Input: nums = [2, 2, 3, 2]
Output: 3

Input: nums = [0, 1, 0, 1, 0, 1, 99]
Output: 99

*/
