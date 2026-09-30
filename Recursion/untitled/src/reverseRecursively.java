public class reverseRecursively {


    public static void main(String[] args) {
        System.out.println(reverse("naman"));
    }

    public static String reverse(String s){
        //Rahul
        StringBuilder sb = new StringBuilder(s);
        recurse(sb,0, sb.length()-1);
        return sb.toString();

    }

    public static void recurse(StringBuilder sb, int low , int high){

        if(low == high){
            return;
        }

        char c = sb.charAt(low);
        sb.setCharAt(low, sb.charAt(high));
        sb.setCharAt(high,c);
        recurse(sb,low+1, high-1);
    }
}
