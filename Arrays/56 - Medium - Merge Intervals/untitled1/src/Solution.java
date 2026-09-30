import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        int[][] nums = {{1,9},{2,5},{19,20},{10,11},{12,20},{0,3},{0,1},{0,2}};
        System.out.println(Arrays.deepToString(nums));

        System.out.println();
        System.out.println(Arrays.deepToString(merge(nums)));

    }


    public static int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<List<Integer>> merged = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        current.add(intervals[0][0]);
        current.add(intervals[0][1]);
        merged.add(current);

        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            int currentEnd=merged.getLast().get(1);

            if(nextStart<=currentEnd) {
                merged.getLast().set(1, Math.max(nextEnd, currentEnd));
            }
            else{
                current=new ArrayList<>();
                current.add(nextStart);
                current.add(nextEnd);
                merged.add(current);

            }
        }

        int[][] result = new int[merged.size()][2];

        for (int i = 0; i < merged.size() ; i++) {
            result[i][0]=merged.get(i).get(0);
            result[i][1]=merged.get(i).get(1);

        }

        return result;

    }


}
