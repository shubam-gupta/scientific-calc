package com.testingproject.scientificcalc.service;

public class MathematicalPatternEvaluator {

    public int[] swap(int [] arr, int  i , int j){
        int temp = arr[i]  ;
        arr[i]   = arr[j];
        arr[j]   = temp;
        return arr;
    }

    //Function to get the next permutation
    public String nextPermutation(String number) {

        if(number.length() <= 0 || Integer.parseInt(number)<0)
            return "";
        int [] nums = new int[number.length()];

        for(int i =0 ; i<number.length();i++){
            nums[i] = number.charAt(i)-'0';
        }

        int i = nums.length-2;

        if(i<= 0)
            return "";


        for( i = nums.length-2; i>=0 ;i--){

            if(nums[i]<nums[i+1]){

                break;
            }
        }

        if(i >=0 ){
            int j =nums.length-1;
            for(; j>i ; j--){
                if(nums[i]<nums[j]){
                    break;

                }
            }
            nums = swap(nums,i,j);

        }
        i++;

        int j = nums.length-1;
        while(i<j){
            nums = swap(nums,i,j);
            i++;
            j--;
        }

        StringBuilder result = new StringBuilder();
        for(int k : nums){
            result.append(String.valueOf(k));
        }
        return result.toString();
    }





}
