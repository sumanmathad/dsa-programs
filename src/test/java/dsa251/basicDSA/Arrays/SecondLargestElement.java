package dsa251.basicDSA.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SecondLargestElement {

    public static void main(String[] args) {
        assertEquals(7, secondLarge(new int[]{9, 9, 9, 9, 9, 9}));
    }


    static int secondLarge(int[] nums) {
        int second = Integer.MIN_VALUE;
        int first = Integer.MIN_VALUE;

        if (nums.length < 2) {
            System.out.println("Invalid");
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > first) {
                second = first;
                first = nums[i];
            } else if (nums[i] > second && nums[i] != first) {
                second = nums[i];
            }

        }

        if (second == Integer.MIN_VALUE) {
            System.out.print("There is no second largest" + " element\n");
            return -1;
        }
        return second;
    }


}




