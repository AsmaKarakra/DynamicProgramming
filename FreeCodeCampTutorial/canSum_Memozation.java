public class Playground {

    /**
     *
     * Memorization Recipe:
     *
     * 1. Come up with a recursive solution
     *      - Visualize the problem as a tree
     *      - Large problem can be broken down into smaller sub problems as edges of nodes
     *      - Implement a tree visualization using brute force solution
     *      - Test your code to make sure it works
     *
     * 2. Optimize the recursive solution
     *      - Add a memo object
     *      - Keys represent arguments to our function
     *      - values represent return values for those functions
     *      - unique set of arguments will give a particular result
     *      - make sure object is shared between recursive calls
     *
     *
     *      - add base case to return memo values
     *          ** this is different than original base cases in my function
     *
     *      - store return values into our memo object
     */
  
  /**
  
  O(m*n) time where m is the target sum and n is the array length
  
  o(m) space where m is the target sum. We will never have more than m calls within our array before we return 
  
  **/


    public static void main(String[] args){

        int target = 7;

        int[] nums = {2, 3};

        boolean result = canSum(target, nums);

        System.out.println(result);
    }

    public static boolean canSum( int target, int [] nums){

            return canSumHelper(target, nums, new boolean [nums.length]);
    }


    public static boolean canSumHelper(int target, int[] nums, boolean [] memo) {

        for (int i = 0; i < nums.length; i++) {

            int remainder = target - nums[i];

            if (remainder == 0) {
                return memo[i] = true;
            }

            if (remainder < 0) {
                return memo[i] = false;
            }

            memo[i] = true;

            return canSumHelper(remainder, nums, memo);

        }

        return false;
    }

}
