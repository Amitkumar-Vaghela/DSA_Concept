public class EditDistance {

    public static void main(String[] args) {
        String str1 = "sunday";  
        String str2 = "saturday"; 

        int result = editDistance(str1, str2);
        System.out.println("Minimum number of edits required: " + result);
    }

    public static int editDistance(String str1, String str2) {
        int m = str1.length();  // m mai string 1 store kare
        int n = str2.length(); // n mai string 2 store kare 

        // Create a DP table to store results of subproblems
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
               
                if (i == 0) {
                    dp[i][j] = j;
                }
                // If str2 is empty, all characters of str1 need to be removed
                else if (j == 0) {
                    dp[i][j] = i; // i deletions
                }
                // If the characters are the same, no new operation is needed
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If the characters are different, consider all three operations
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j],      
                                   Math.min(dp[i][j - 1],      
                                            dp[i - 1][j - 1])); 
                }
            }
        }

        return dp[m][n];
    }
}
