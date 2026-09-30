public class NumberOfSubstringsWithAll3 {

    public static void main(String[] args) {
        String s = "bbacba";
        System.out.println(numberOfSubstrings(s));

    }

    public static int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int[] seen = new int[3];

        for(int right = 0 ; right<s.length() ; right++){

            seen[s.charAt(right) - 'a']++;

            while(seen[0] > 0 && seen[1] > 0 && seen[2] > 0){
                count += s.length() - right;
                seen[s.charAt(left) -'a']--;
                left++;
            }
        }
        return count;
    }
}
