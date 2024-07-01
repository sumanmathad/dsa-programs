package striver.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class LeftRotateByOnePlace {

    public static void main(String[] args) {

        assertArrayEquals(new int[] {2,3,4,5,1}, leftRotateOnePlace(new int[]{1,2,3,4,5}));
    }


    static int[] leftRotateOnePlace(int[] nums){
        int first = nums[0];
        for(int i=0; i< nums.length-1;i++){
                nums[i]=nums[i+1];
            }
        nums[nums.length-1]=first;
        return nums;
    }






}
