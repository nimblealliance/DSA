public class CardMF {


    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{1, 2, 3, 4, 5, 6} , 3));
    }

    public static int maxScore(int[] cardScore, int k) {
        int n = cardScore.length;
        int totalScore = 0;
        int windowScore = 0;
        int minWindowScore = Integer.MAX_VALUE;
        int left = 0;

        for(int right = 0 ; right<cardScore.length ; right++){
            totalScore+=cardScore[right];
            windowScore+=cardScore[right];

            int length = right - left + 1;

            while(length > n - k){
                windowScore-=cardScore[left];
                left++;
                length = right - left + 1;
            }

            if(length == n - k){
                minWindowScore = Math.min(minWindowScore , windowScore);
            }
        }

        if(n == k) return totalScore;
        return totalScore - minWindowScore;
    }
}



