class boo2 {

    public static void main(String[] args) {
        int gcd = GCD(4, 6);
        System.out.println(gcd);
    }

    public static int GCD(int n1, int n2) {

        int largest = (n1 > n2) ? n1 : n2;
        int ans=1;
        for (int i =1 ; i<=largest ; i++){
            if ((n1%i==0) && (n2%i==0)){
                ans=i;
            }
        }
        return ans;
    }
}