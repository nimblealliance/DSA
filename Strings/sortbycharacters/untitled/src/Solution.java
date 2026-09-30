import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {

    }


    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);//put it in hashmap
        }

        ArrayList<Character> list = new ArrayList<>(map.keySet()); //get the keyset to a list
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a)); // sort that list using custom comparator
        //we get the values for each element from map and the highest one gets first

        StringBuilder ans = new StringBuilder();
        for (char c : list) {  // iterate through the list
            for (int i = 0; i < map.get(c); i++) { // and append as many times the character occurs in the map
                ans.append(c);
            }
        }
        return ans.toString();
    }
}

