public class CountDigitMF {


    public static void main(String[] args) {
        System.out.println(countRecurse(1234567891));
    }

    public static int countRecurse(int n){

        if (n == 0){
            return 0;
        }

        int digit = n%10;
        n=n/10;
        int ans=countRecurse(n);
        return ans+digit;
    }
}
