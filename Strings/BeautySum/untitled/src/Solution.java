public class Solution {

    public static void main(String[] args) {
        String s="aabcbaa";
        System.out.println(beautySum(s));

    }


    public static int beautySum(String s){

        int n = s.length();
        int ans=0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <=n ; j++) {

                int[] freq = new int[26];
                String subString= s.substring(i,j);
                for (char c : subString.toCharArray()){
                    freq[c-'a']++;
                }
                int maxFreq = 0 ; int minFreq = Integer.MAX_VALUE;
                for(int f : freq){
                    if (f > 0){
                        maxFreq = Math.max(maxFreq,f);
                        minFreq = Math.min(minFreq,f);
                    }
                }
                ans += maxFreq-minFreq;
            }
        }
        return ans;
    }
}
