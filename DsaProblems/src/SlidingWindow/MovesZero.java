package DsaProblems.src.SlidingWindow;

import java.util.Arrays;

/*
Input: [0, 1, 0, 3, 12]
Output: [1, 3, 12, 0, 0]
 */
public class MovesZero {
    private static void moveZeroes(int[] nums) {
        int ln = nums.length-1, count=0, j=0;
        for (int i=0; i<=ln; i++) {
            if(nums[i]!=0){
                if(count==0){
                    j++;
                } else{
                    nums[j]=nums[i];
                    j++;
                }
            } else {
                count++;
            }
        }
        //After Place All Non-Zero element than Placed Zero in Array.
        while(count>0){
            nums[ln] = 0;
            ln--;
            count--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
    }

}
