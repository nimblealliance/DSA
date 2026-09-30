import java.util.HashMap;

public class Solution {


    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {

        int n = s.length();
        HashMap<Character , Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans =0;

        for (int i = 0; i < n; i++) {
            if (i+1 < n && map.get(s.charAt(i+1))>map.get(s.charAt(i))){
                ans -= map.get(s.charAt(i));
            }else {
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }

}
