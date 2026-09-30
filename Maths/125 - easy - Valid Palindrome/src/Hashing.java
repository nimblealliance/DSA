import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] arr = {10, 5, 10, 15, 10, 5};

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for( Map.Entry<Integer, Integer> entry : entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

    }

}
