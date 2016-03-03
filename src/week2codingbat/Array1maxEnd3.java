package week2codingbat;

/*Given an array of ints length 3, figure out which is larger between
the first and last elements in the array, and set
all the other elements to be that value. Return the changed array.

maxEnd3({1, 2, 3}) → {3, 3, 3}
maxEnd3({11, 5, 9}) → {11, 11, 11}
maxEnd3({2, 11, 3}) → {3, 3, 3}*/

public class Array1maxEnd3 {

    public static int[] maxEnd3(int[] nums) {

        if (nums[0] > nums[2]) {
            nums[2] = nums[0];
            nums[1] = nums[0];
        } else {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
    }
}
