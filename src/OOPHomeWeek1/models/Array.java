package OOPHomeWeek1.models;

public class Array {

    private int[] nums;

    public Array(int[] nums) {
        this.nums = nums;
    }

    public int[] getArray() {
        return nums;
    }

    //operations
    public int findMinInArray() {

        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(nums[i], min);
        }
        return min;
    }

    public int findMaxInArray() {

        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public Array genArray(int range) {

        for (int i = 0; i < nums.length; i++) {
            this.nums[i] = (int)(Math.random() * range);
        }
        return new Array(nums);
    }

    public void printArray() {

        String res = "";

        for (int i = 0; i < nums.length - 1; i++) {
            res += nums[i] + " ";
        }

        System.out.print("{" + res + nums[nums.length - 1] + "}");
    }

    public Array increaseArray(int addSize) {

        int[] newArray = new int[nums.length + addSize];

        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i];
        }
        return new Array(newArray);
    }

    public Array sortingArray(String sign) {

        int current = 0;

        if (sign.equals("++")) {

            for (int k = 0; k < 1; ) {

                int count = 0;

                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] > nums[i + 1]) {
                        current = nums[i + 1];
                        nums[i + 1] = nums[i];
                        nums[i] = current;
                    }
                }

                for (int i = 0; i < nums.length - 1; i++) {
                    if ((nums[i + 1] - nums[i]) < 0) {
                        break;
                    } else {
                        count++;
                    }
                }
                k = count == (nums.length - 1) ? 1 : 0 ;
            }
        }

        if (sign.equals("--")) {

            for (int k = 0; k < 1; ) {

                int count = 0;

                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] < nums[i + 1]) {
                        current = nums[i + 1];
                        nums[i + 1] = nums[i];
                        nums[i] = current;
                    }
                }

                for (int i = 0; i < nums.length - 1; i++) {
                    if ((nums[i + 1] - nums[i]) > 0) {
                        break;
                    } else {
                        count++;
                    }
                }
                k = count == (nums.length - 1) ? 1 : 0 ;
            }
        }
        return new Array(nums);
    }


}