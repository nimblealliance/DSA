import java.util.ArrayList;
import java.util.Collections;

class Solution {

    public static void main(String[] args) {
        System.out.println(divisors(36));

    }

    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=1 ; i<=(int)Math.sqrt(n) ; i++){
            if (n%i==0){
                ans.add(i);
                if (n/i!=i){
                    ans.add(n/i);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}