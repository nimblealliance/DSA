import java.util.ArrayList;

public class findKRotation {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        for (Integer i : nums){
            list.add(i);
        }

        int minIndex = findMinIndex(list);
        System.out.println(minIndex);


    }



    public static int findMinIndex(ArrayList<Integer> nums){

        int low=0;
        int high=nums.size()-1;
        int min=Integer.MAX_VALUE;
        int rotationIndex =-1;

        while (low<=high){

            int mid=low+ ((high-low)/2);

            if (nums.get(low)<=nums.get(mid)){

                if (nums.get(low) < min){
                    min=nums.get(low);
                    rotationIndex =low;
                }
                low=mid+1;
            }
            else {
                if (nums.get(mid) < min){
                    min=nums.get(mid);
                    rotationIndex =mid;
                }
                high=mid-1;

            }
        }
        return rotationIndex;
    }
}
