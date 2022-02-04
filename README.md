# DynamicProgramming
## Memorization Recipe:
    
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
     
