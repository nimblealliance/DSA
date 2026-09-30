public class RosesMf {

    public static void main(String[] args) {
        int[] bloomDay = {1000000000,1000000000};
        int m = 1;
        int k = 1;
        System.out.println(roses(bloomDay, m, k));
    }


    public static int roses(int[] bloomDay, int m, int k) {


        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int lowestDay = Integer.MAX_VALUE;
        int highestDay = Integer.MIN_VALUE;


        for (Integer i : bloomDay) {
            lowestDay = Math.min(lowestDay, i);
            highestDay = Math.max(highestDay, i);

        }

        int low = lowestDay;
        int high = highestDay;

        while (low <= high) {

            int mid = low + ((high - low) / 2);
            boolean possibility = isBouquetPossible(bloomDay, m, k, mid);

            if (possibility) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }


    public static boolean isBouquetPossible(int[] bloomDay, int m, int k, int currentDay) {

        int numOfBouquets = 0;
        int count = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= currentDay) {
                count++;

                if (count == k) {
                    numOfBouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }

        }
        return numOfBouquets >= m;
    }

}
