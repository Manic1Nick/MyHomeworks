package week2codingbat;

/*Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28({2, 3, 2, 2, 4, 2}) → true
sum28({2, 3, 2, 2, 4, 2, 2}) → false
sum28({1, 2, 3, 4}) → false*/

public class Array2sum28 {

    public static boolean sum28(int[] nums) {

        int sumOf2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sumOf2 += 2;
            }
        }
        if (sumOf2 == 8) {
            return true;
        }
        return false;
    }
}
