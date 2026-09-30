public class LongestCommon {

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {

        String firstString = strs[0];
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<firstString.length() ; i++){
            String currString = firstString.substring(0,i);
            for(int j=1 ; j<strs.length; j++){
                if (strs[j].startsWith(currString)){
                    continue;
                }else {
                    break;
                }
            }
        }
        return firstString.substring(0,1);
    }

}
