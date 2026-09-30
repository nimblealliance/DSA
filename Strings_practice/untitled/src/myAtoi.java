public class myAtoi {
    public static void main(String[] args) {
        String s = "21474836460";
        System.out.println(myAtoi(s));
    }



    public static int myAtoi(String s) {

        int n = s.length();
        int i=0;
        long ans=0;

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int sign = 1;

        if (i<n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i<n &&  s.charAt(i) == '+') {
            i++;
        }

        while(i<n && s.charAt(i)=='0'){
            i++;
        }

        while(i<n){
            char c = s.charAt(i);

            if (c >= '0' && c<= '9'){
                ans = ans * 10 + (c - '0');
                i++;
                if (ans * sign >=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
                if (ans * sign<= Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return (int) ans*sign;
    }




}
