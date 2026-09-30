import java.util.ArrayList;
import java.util.List;

public class ReverseWords {

    public static void main(String[] args) {

        String s = "a good   example";
        System.out.println(reverseWords(s));


    }


    public static String reverseWords(String s) {

        List<String> words = new ArrayList<>();

        int i = 0;
        int n = s.length();
        int start = 0;
        int end = 0;

        while (i <n){

            while (i < n && s.charAt(i)==' '){
                i++;
            }

            if (i >=n){
                break;
            }

            start = i;

            while (i< n && s.charAt(i)!=' '){
                i++;
            }
            end = i;

            words.add(s.substring(start,end));

        }


        StringBuilder sb = new StringBuilder();
        for (int j = words.size() - 1 ; j>=0 ; j--){
            sb.append(words.get(j));
            if(j!=0){
                sb.append(" ");
            }
        }
        return sb.toString();

    }




}
