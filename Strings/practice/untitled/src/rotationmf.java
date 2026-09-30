public class rotationmf {

    public static void main(String[] args) {

    }

    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()){
            return false;
        }
        String boo = s+s;

        for (int i = 0; i < s.length(); i++) {
            if (boo.substring(i).contains(goal)){
                return true;
            }
        }return false;

    }
}
