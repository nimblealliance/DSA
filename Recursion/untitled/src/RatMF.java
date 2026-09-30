import java.util.ArrayList;
import java.util.List;

class RatMF {

    public static void main(String[] args) {

        int[][] grid = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};

        int[][] grid2 = {{1,0},{1,0}};
        System.out.println(findPath(grid2));
    }

    public static List<String> findPath(int[][] grid) {
        List<String> ans = new ArrayList<>();
        findAllPaths(0 , 0 , new StringBuilder() , ans , grid);
        return ans;
    }

    public static void findAllPaths(int row, int col, StringBuilder sb, List<String> ans, int[][] grid) {

        if (row == grid.length - 1 && col == grid.length -1) {
            ans.add(sb.toString());
            return;
        }

        if (row < 0 || col < 0 || row >= grid.length || col >= grid.length || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0;

        sb.append('R');
        findAllPaths(row, col + 1, sb, ans, grid);
        sb.deleteCharAt(sb.length() - 1);

        sb.append('D');
        findAllPaths(row + 1, col, sb, ans, grid);
        sb.deleteCharAt(sb.length() - 1);

        sb.append('L');
        findAllPaths(row, col - 1, sb, ans, grid);
        sb.deleteCharAt(sb.length() - 1);

        sb.append('U');
        findAllPaths(row - 1, col, sb, ans, grid);
        sb.deleteCharAt(sb.length() - 1);

        grid[row][col] = 1;
    }
}