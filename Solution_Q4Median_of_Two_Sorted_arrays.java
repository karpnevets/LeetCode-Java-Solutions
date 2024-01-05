import java.util.ArrayList;
import java.util.Collections;

public class Solution_Q4Median_of_Two_Sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        ArrayList temp = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            temp.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            temp.add(nums2[i]);
        }
        Collections.sort(temp);
        if (len%2 == 0){
            return ((double)(int)temp.get(len/2 - 1) + (double)(int)temp.get(len/2))/2;
        }
        else
            return (int)temp.get(len/2);
    }
}

/**Attempts: 3   Runtime: 6ms   Memory: 46.68MB**/