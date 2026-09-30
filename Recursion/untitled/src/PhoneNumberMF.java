import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneNumberMF {

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {

        HashMap<Character , char[]> map = new HashMap<>();
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});

        List<String> ans = new ArrayList<>();
        List<Character> combination = new ArrayList<>();
        generateAllCombinations(digits , 0, digits.length(),combination , ans , map);
        return ans;
    }


    public static void generateAllCombinations(String digits , int ind , int n , List<Character> combination , List<String> ans , HashMap<Character , char[]> map){

        if(combination.size()==digits.length()){
            ans.add(convertToString(combination));
            return;
        }

        char c = digits.charAt(ind);
        char[] arr1 = map.get(c);
        for(int i=0 ; i<arr1.length ; i++){
            combination.add(arr1[i]);
            generateAllCombinations(digits , ind+1 , n , combination , ans , map);
            combination.remove(combination.size()-1);
        }
    }

    public static String convertToString(List<Character> charList){
        StringBuilder sb = new StringBuilder();
        for(Character c : charList){
            sb.append(c);
        }
        return sb.toString();
    }
}
