class Solution {


    public static void main(String[] args) {
        System.out.println(countDigit(5000));
    }

    public static int countDigit(int n) {
        if (n == 0) return 1;
        int count=0;
        while(n > 0){
            count++;
            n=n/10;
        }

        return count;
    }
}