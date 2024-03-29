package com.series.InterviewPrep2024.Paypal;

public class LargestSumContiguousArr {

    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        
        int max_ending_here = 0;
        int max_so_far = Integer.MIN_VALUE;
        int start = 0, end = 0, s = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];
            if(max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
                s = i+1;
            }
        }

        System.out.println(max_so_far);
    }
}
