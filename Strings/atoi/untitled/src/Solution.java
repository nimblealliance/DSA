class Solution {

    public static void main(String[] args) {



    }



    public static int myAtoi(String s) {
        int n = s.length();
        long ans = 0;
        int i = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int sign = 1;

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        while (i < n) {
            if (s.charAt(i) == '0') {
                i++;
            } else {
                break;
            }
        }

        while (i < n) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                ans = ans * 10 + (c - '0');
                i++;
                if (ans * sign >= Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (ans * sign <= Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        return (int) ans * sign;
    }
}