import java.util.*;

public class AsteroidMf {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(asteroidCollision(new int[]{-2,-2,1,-2})));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();
        int n = asteroids.length;

        for(int i=0 ; i<n ; i++){
            if(asteroids[i]<0){
                while(!st.isEmpty() && st.peek() >0 && st.peek() < -(asteroids[i])){
                    st.pop();
                }

                if(!st.isEmpty() && st.peek() > -(asteroids[i])){
                    continue;
                }

                if(!st.isEmpty() && st.peek() == -(asteroids[i])){
                    st.pop();
                    continue;
                }
                st.push(asteroids[i]);
            }
            else{
                st.push(asteroids[i]);
            }
        }

        List<Integer> temp = new ArrayList<>();
        while(!st.isEmpty()){
            temp.add(st.pop());
        }

        int m=temp.size();
        int[] ans = new int[m];

        for(int i = 0 ; i<m ; i++){
            ans[i]=temp.get(m-i-1);
        }
        return ans;
    }


}
