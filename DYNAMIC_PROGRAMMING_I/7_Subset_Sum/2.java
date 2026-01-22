class Result {
    static String longestCommonSubsequence(String str1, String str2) {

        int m = str1.length();
        int n = str2.length();

        int[][] L = new int[m + 1][n + 1];

        // Step 1: Build DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
                }
            }
        }

        // Step 2: Backtracking
        ArrayList<Character> res = new ArrayList<>();
        int i = m, j = n;

        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                res.add(str1.charAt(i - 1));
                i--;
                j--;
            } else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Step 3: Convert ArrayList to String
        StringBuilder ans = new StringBuilder();
        for (int k = res.size() - 1; k >= 0; k--) {
            ans.append(res.get(k));
        }

        return ans.toString();
    }
}
