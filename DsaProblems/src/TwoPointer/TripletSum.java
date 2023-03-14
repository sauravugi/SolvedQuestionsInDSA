package DsaProblems.src.TwoPointer;

import java.util.*;

/*
(Medium Level Question)
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
 */
public class TripletSum {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> answer = tripletSum(nums,1);
        answer.forEach(s -> System.out.println(s));

    }
    static List<List<Integer>> tripletSum(int[] nums , int target){
        Set<List<Integer>> output = new HashSet<>();
        Arrays.sort(nums);
        for( int i = 0; i < nums.length-2 ; i++ ){
            int l = i+1 , r = nums.length-1;
            while(l<r){
                if(nums[i]+nums[l]+nums[r] == target){
                    List<Integer> list = Arrays.asList(nums[i],nums[l],nums[r]);
                    output.add(list);
                    l++;
                    r--;
                }else if(nums[i]+nums[l]+nums[r] < 0) l++;
                else r--;
            }
        }
        List<List<Integer>> answer = new ArrayList<>(output);
        return answer;

    }

}
