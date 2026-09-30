public class RemoveOccurencesMF {


    public static void main(String[] args) {
        String s = "apple";
        char c = 'p';
        s = removeChar(s,c);
        System.out.println(s);
    }

    public static String removeChar(String s, char c){
        StringBuilder sb = new StringBuilder();
        removeRecurse(s,sb,c,0);
        return sb.toString();
    }

    public static void removeRecurse(String s , StringBuilder sb , char c, int ind){
        if(ind == s.length()){
            return;
        }

        if(s.charAt(ind)!=c){
            sb.append(s.charAt(ind));
        }

        removeRecurse(s,sb,c,ind+1);
    }
}
