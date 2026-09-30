public class TrappingShii {

    public static void main(String[] args) {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));

    }


    public static int trap(int[] height) {
        int n = height.length;

        int left = 0;
        int right = n-1;

        int lmax = 0;
        int rmax = 0;
        int ans = 0;

        while(left < right){
            lmax = Math.max(lmax , height[left]);
            rmax = Math.max(rmax , height[right]);

            if(lmax <= rmax){
                ans += lmax - height[left];
                left++;
            }else {
                ans += rmax - height[right];
                right--;
            }
        }
        return ans;
    }

    public static int trap2(int[] height) {

        int n = height.length;
        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        prefixMax[0]=height[0];
        suffixMax[n-1]=height[n-1];

        for(int i=1; i< n ; i++){
            prefixMax[i]=Math.max(prefixMax[i-1],height[i]);
        }

        for(int i=n-2 ; i>=0 ; i--){
            suffixMax[i]=Math.max(suffixMax[i+1],height[i]);
        }

        int total = 0;

        for(int i=0 ; i<n ; i++){
            int min = Math.min(prefixMax[i], suffixMax[i]);
            int diff = min-height[i];
            if(diff>0){
                total+=diff;
            }
        }
        return total;
    }
}
