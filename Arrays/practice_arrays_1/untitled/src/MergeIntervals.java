import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {


    public static void main(String[] args) {

    }


    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> merged = new ArrayList<>();
        List<Integer> current = new ArrayList<>();


        current.add(intervals[0][0]);
        current.add(intervals[0][1]);
        merged.add(current);


        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];
            int currentEnd = merged.getLast().get(1);

            if (nextStart <= currentEnd) {
                merged.getLast().set(1, Math.max(currentEnd, nextEnd));
            } else {
                current = new ArrayList<>();
                current.add(nextStart);
                current.add(nextEnd);
                merged.add(current);
            }
        }

        int[][] res = new int[merged.size()][2];

        for (int i = 0; i < merged.size(); i++) {
            res[i][0] = merged.get(i).get(0);
            res[i][1] = merged.get(i).get(1);

        }
        return res;

    }
}
