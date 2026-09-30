public class LongestSubstringWithoutRepeatingMfs {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {

        boolean[] seen = new boolean[128];
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            if(left < right && seen[s.charAt(right)]){
                seen[s.charAt(left)] = false;
                left++;
            }

            while( right < s.length() && !seen[s.charAt(right)]){
                seen[s.charAt(right)] = true;
                maxLength = Math.max(maxLength , right - left +1);
                right++;
            }
        }
        return maxLength;
    }
}
