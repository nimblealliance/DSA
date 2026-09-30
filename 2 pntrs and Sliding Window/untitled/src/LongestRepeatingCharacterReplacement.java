public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {

    }


    public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int n = s.length();
        int maxFreq = 0;
        int[] freq = new int[26];

        for(int right = 0 ; right<n ; right++){
            freq[s.charAt(right)-'A']++;
            maxFreq =  Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int length = right - left + 1;

            while(length - maxFreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            if(length - maxFreq <= k){
                maxLength = Math.max(maxLength , length);
            }
        }
        return maxLength;
    }


}
