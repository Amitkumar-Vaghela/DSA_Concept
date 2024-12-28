class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        int cnt = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                cnt ++;
                maxi = Math.max(maxi , cnt);
            }
            else{
                cnt= 0;
            }
        }
       return maxi; 
    }
}


// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2
