class Solution {
    public int GCD(int n1, int n2) {

        int largest = (n1 > n2) ? n1 : n2;
        int ans=1;
        for (int i =1 ; i<=largest ; i++){
            if ((n1%i==0) && (n2%i==0)){
                ans=i;
            }
        }
        return ans;
    }

    //optimal approach
    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            // If a is greater than b,
            // subtract b from a and update a
            if(a > b) {
                // Update a to the remainder
                // of a divided by b
                a = a % b;
            }
            // If b is greater than or equal
            // to a, subtract a from b and update b
            else {
                // Update b to the remainder
                // of b divided by a
                b = b % a;
            }
        }
        // Check if a becomes 0,
        // if so, return b as the GCD
        if(a == 0) {
            return b;
        }
        // If a is not 0,
        // return a as the GCD
        return a;
    }




}