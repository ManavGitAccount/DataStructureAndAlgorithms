package SortingAlgorithms.LBP.StringProblems.Medium.BackTrackingApproach;
class Solution {
    public void twoSum( int[] nums, int target ) {

        int[] arr = new int[2];

        for(int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        for(int k=0; k<arr.length; k++){
            System.out.print(arr[k]);
        }
    }

    public static void main( String[] args ) {

        int[] nums = {2,5,5,11};
        int target = 10;
        Solution ko = new Solution();
        ko.twoSum(nums, target);


    }
}