public class Solution {

    public static void main(String[] args) {
        String s = "PoOryN2nW43Y1n4bcBGnTIDlwR6P92EpevvgG7lhvk7HhKExyxyClGv5bDQ8bnqiFkR6Wk8iaTySxgP25ITXIgPqqlRltCtA352W8DWpq0MaMKMSO4adsApF8d9GNytEsaUQcdDurunfweXMNb862XiORBJ3NCtBBE0Y3A9dh5VNQ4qFJ6xu7pOEhYWhrEHF6jkb0DQPPreBqEpFOUnyfCLtZzYFROwoPyEoIxZK9ZHLJAbuKKmpmsi3Ib8jKG4E3baAMZ4hdOcmL55PzfTHLaMae0THFuyVYTjKNR58RMkT7vWu8awTKlKLE0eEipuz6L4g9TjDVdRqaEAVh1gPXMkREWiaMAwECHE3jcLIkPn1WTAsI3FopYENDGVdUN0UcYPH6KDPtaz9hfB2w7ne1T9ZdP8qShKCvgwwDo2IXbEuXNsG4N2ONhPEKMQx9wj3juqTGDmuiyW7vI3PJLEwnFolnFEVBkDovGZCHrSGlm3YMJDmXedTTdeXmDJMY3mlGSrHCZGvoDkBVEFnloFnwELJP3Iv7WyiumDGTquj3jw9xQMKEPhNO2N4GsNXuEbXI2oDwwgvCKhSq8PdZ9T1en7w2Bfh9zatPDK6HPYcU0NUdVGDNEYpoF3IsATW1nPkILcj3EHCEwAMaiWERkMXPg1hVAEaqRdVDjT9g4L6zupiEe0ELKlKTwa8uWv7TkMR85RNKjTYVyuFHT0eaMaLHTfzP55LmcOdh4ZMAab3E4GKj8S1IuFJ3RxUE9hLnhOC2NuX12jeOPKOwpgd9IwxprQOLZf0tGktIRs4mdBZxP4DS7R2yz0Ey63JtJ8eNZYNhZoj6EUoEv5cx9Vx8gJAECjuvuNilXNPbKPV9jYfoCGp5HqGf5Ua4K3XdaIzTqinUaOHXDyDOoD8Xkkzl9k7bZ0ltZ2DwvaH2JL1LoVp4sA6YFFSi3MO1scE73lTv741OfavgjqcfB2fOb50qjNZLEhFdp649qXKEkRrxBDy";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        int n = s.length();
        if (n <= 1)
            return s;

        String ans = "";

        for (int i = 0; i < n - 1; i++) { // for each index we take it as our center and expand from it

            String odd = expandFromCenter(i, i, s); // for odd length substrings , left and right are at the same index
            // eg. abcba , imagine i is at c , so left and right will start from there

            String even = expandFromCenter(i, i + 1, s); // for even length substrings , left and right start at diff
            // positions , eg , abba , imagine i is at b at 1st index , so left will be b and right will also be at b.

            if (odd.length() > ans.length()) {
                ans = odd;
            }

            if (even.length() > ans.length()) {
                ans = even;
            }
        }
        return ans;

    }

    public static String expandFromCenter(int left, int right, String s) {

        int n = s.length();

        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) { // we keep expanding until left and right chars are equal and left and right pointers are within bounds
            left--;
            right++;
        }
        return s.substring(left + 1, right); // at the end the substring starts from left+1 ,
        //eg , cbaabd , left will stop at c and right will stop at d since left and right moved one step beyond a valid palindrome.
        // since Java's substring method's start is inclusive and end is exclusive , to get palindrominc substring
        // baad , we need to tell it to do left+1 as start so as to avoid 'c' and right can be used as it is since
        // it is exclusive so it anyway will avoid the 'd' at the end.

    }

//    public static String longestPalindrome(String s) {
//
//        int n= s.length();
//        int maxLength=0;
//        String ans="";
//        for (int i = 0; i < n; i++) {
//            int length=0;
//            for (int j = i+1; j <= n; j++) {
//                String substr=s.substring(i,j);
//                if (isPalindrome(substr)){
//                    length=j-i+1;
//                    if (length >maxLength){
//                        ans=substr;
//                        maxLength=length;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//
//
//    public static boolean isPalindrome(String s){
//
//        int n = s.length();
//        int i=0;
//        int j = n-1;
//
//        while (i < j){
//            if (s.charAt(i) == s.charAt(j)){
//                i++;
//                j--;
//            }else {
//                return false;
//            }
//        }
//        return true;
//    }
}
