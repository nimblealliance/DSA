import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing2 {
    public static void main(String[] args) {

        int lowestValue=1;
        int highestValue=1;
        int lowestEntry=0;
        int highestEntry=0;

        HashMap<Integer , Integer> map = new HashMap<>();
        int[] arr = {2,2,3,4,4,2};

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }



        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for( Map.Entry<Integer, Integer> entry : entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        for( Map.Entry<Integer, Integer> entry : entries){
            if(entry.getValue()>highestValue){
                highestValue=entry.getValue();
                highestEntry=entry.getKey();
            }

            if (entry.getValue()<=lowestValue){
                lowestValue=entry.getValue();
                lowestEntry=entry.getKey();
            }

        }


        System.out.println(lowestEntry);
        System.out.println(highestEntry);



    }

}
