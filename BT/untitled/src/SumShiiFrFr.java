import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SumShiiFrFr {

    public static void main(String[] args) {
        int[] shii = new int[]{5, 10, -5, -10, 8, -8, -3, 12};
        System.out.println(Arrays.toString(asteroidCollision(shii)));

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();


        for(int asteroid : asteroids){
            boolean survived = true;
            while(!st.isEmpty() && survived && asteroid < 0 && st.peek() > 0 ){
                if(st.peek() < -asteroid){
                    st.pop();
                }else if(st.peek() > -asteroid){
                    survived = false;
                }else{
                    st.pop();
                    survived = false;
                }
            }

            if(survived){
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];
        int index = st.size() -1;

        while(!st.isEmpty()){
            ans[index--] = st.pop();
        }

        return ans;
    }



}
