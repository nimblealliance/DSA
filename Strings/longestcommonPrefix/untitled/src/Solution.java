import java.util.Arrays;

class Solution {


    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));

    }


    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        String smallest = strs[0];
        int n = smallest.length();
        StringBuilder ans = new StringBuilder();

        for (int i=0 ; i <n ; i++){
            boolean matchesAll=false;
            String alphabet = smallest.substring(0,i+1);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].contains(alphabet)){
                    matchesAll=true;
                }else {
                    matchesAll=false;
                    break;
                }
            }

            if (matchesAll){
                ans = new StringBuilder(alphabet);
            }

        }
        return ans.toString();
    }
}