/**


Question is called unique paths on leetcode: https://leetcode.com/problems/unique-paths

**/


//Memoization (Runtime 0 ms, Time complexity m x n, Space complexity: m x n):

class Solution {
  public int uniquePaths(int m, int n) {
    return uniquePathsHelper(m - 1, n - 1, new int[n][m]);
  }
  
  private int uniquePathsHelper(int m, int n, int[][] memo) {
    if (m < 0 || n < 0) {
      return 0;
    } else if (m == 0 || n == 0) {
      return 1;
    } else if (memo[n][m] > 0) {
      return memo[n][m];
    } else {
      memo[n][m] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);
      return memo[n][m];
    }
  }
} 

//Dynamic programming (Runtime 1 ms, Time complexity m x n, Space complexity: m x n)

class Solution {
  public int uniquePaths(int m, int n) {
    int[][] grid = new int[n][m];
    
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (i == 0) grid[0][j] = 1;
        if (j == 0) grid[i][j] = 1;
        if (i != 0 && j != 0) {
          int up = grid[i - 1][j];
          int left = grid[i][j - 1];
          grid[i][j] = up + left;
        }
      }
    }
    return grid[n - 1][m - 1];
  }
} 
