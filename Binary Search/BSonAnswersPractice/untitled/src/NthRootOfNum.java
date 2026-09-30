public class NthRootOfNum {

    public static void main(String[] args) {
        System.out.println(nRoot(9,512));

    }

    public static int nRoot(int N , int M){

        int low=1;
        int high=M;

        while (low<=high){

            int mid = low + ((high-low)/2);

            long val= findRoot(M , N , mid);

            if (val==1){
                return mid;
            } else if (val==2) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static int findRoot(int M ,int N, int mid){

        long result=1;

        for (int i = 0; i < N; i++) {
            result*=mid;
            if (result>M) return 2;
        }
        if (result==M) return 1;
        return 0;
    }

}
