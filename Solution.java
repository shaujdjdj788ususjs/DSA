public class Solution{

    public boolean isMatch(String s, String p) {

        int m = s.length();
        int n = p.length();

        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        // Handle patterns like a*, a*b*, a*b*c* matching empty string
        for (int j = 2; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                if (p.charAt(j - 1) == s.charAt(i - 1) 
                    || p.charAt(j - 1) == '.') {

                    dp[i][j] = dp[i - 1][j - 1];

                } else if (p.charAt(j - 1) == '*') {

                    dp[i][j] = dp[i][j - 2];

                    char prev = p.charAt(j - 2);
                    if (prev == s.charAt(i - 1) || prev == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }

        return dp[m][n];
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s = "aab";
        String p = "c*a*b";

        boolean result = sol.isMatch(s, p);

        System.out.println("String: " + s);
        System.out.println("Pattern: " + p);
        System.out.println("Match result: " + result);
    }
}