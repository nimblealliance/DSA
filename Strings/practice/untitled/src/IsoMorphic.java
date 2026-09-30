public class IsoMorphic {

    public static void main(String[] args) {

    }

    public static boolean isIsomorphic(String s, String t){

        int n = s.length();
        int[] sArray = new int[256];
        int[] tArray = new int[256];

        for (int i = 0; i < n; i++) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sArray[sChar] != tArray[tChar]){
                return false;
            }
            sArray[sChar] = i+1;
            tArray[tChar] = i+1;
        }
        return true;
    }

}
