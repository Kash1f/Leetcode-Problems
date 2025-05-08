package Easy.Arrays;

import java.util.Arrays;

class MoveZeroes {

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(MoveZeroes(nums)));
    }

    public static void MoveZeroes(int[] nums) {
        int count = 0;
        //traverse from 1st index to the last index
        for(int i = 0; i < nums.length; i++){
            if(nums[i] !=0){
               nums[count++] = nums[i];
            } 
        }

        while (count < nums.length){
            nums[count++] = 0;
        }
    }
}

//Explanation:
//The problem is to move all the zeroes in the array to the end of the array while maintaining the order of non-zero elements.

//we will traverse through each element and whenever we find a non-zero element, we will move it to the front of the array.

//declare a counter variable and make it 0, then traverse each index of the array using for loop

//during traversing the array check if the element is non zero then put the element at the counter position and increment the counter by 1

//at the end you can put a while loop to put the remaining elements as 0, so that the array is in the required format.