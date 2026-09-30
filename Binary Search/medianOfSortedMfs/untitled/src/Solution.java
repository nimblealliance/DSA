import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        int [] arr1= {2};
        int [] arr2= {};
        System.out.println(median(arr1,arr2));

    }

    public static double median(int[] arr1, int[] arr2) {

        double ans = 0;

        int m = arr1.length;
        int n = arr2.length;

        int [] resultant = new int[m+n];

        int l=0;
        int r=0;
        int k=0;

        while (l<m && r < n){

            if (arr1[l]<=arr2[r]){
                resultant[k]=arr1[l];
                l++;

            }else {
                resultant[k]=arr2[r];
                r++;
            }
            k++;
        }

        while (l < m ){
            resultant[k]=arr1[l];
            l++;
            k++;
        }

        while (r < n ){
            resultant[k]=arr2[r];
            r++;
            k++;
        }

        System.out.println(Arrays.toString(resultant));
        int x = resultant.length;

        if (x == 1){
            return (double) resultant[0];
        }

        if (resultant.length%2==0){

            ans = (double) ((resultant[x/2]+resultant[(x/2)-1])/2.0);
        } else {
            int req = x/2;
            ans = (double) (resultant[req]);
        }
        return ans;

    }





}
