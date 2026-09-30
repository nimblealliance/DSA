import java.util.HashMap;
import java.util.Map;

public class FruitsMf {

    public static void main(String[] args) {
        System.out.println(totalFruit(new int []{3,3,3,1,2,1,1,2,3,3,4}));
    }

    public static int totalFruit(int[] fruits) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLength = 0;

        while(right < fruits.length){

            if(map.size() == 2 && !map.containsKey(fruits[right])){
                int minKey=0;
                int minVal=Integer.MAX_VALUE;

                for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                    if(entry.getValue() <= minVal){
                        minKey = entry.getKey();
                        minVal = entry.getValue();
                    }
                }
                left = map.get(minKey)+1;
                map.remove(fruits[minKey]);
            }

            while(map.size() < 2 && !map.containsKey(fruits[right])){
                map.put(fruits[right] , right);
            }

            if(map.containsKey(fruits[right])){
                map.put(fruits[right] , right);
            }

            if(map.size() == 2){
                maxLength = Math.max(maxLength , right - left + 1);
            }
            right++;
        }
        return maxLength;
    }
}
