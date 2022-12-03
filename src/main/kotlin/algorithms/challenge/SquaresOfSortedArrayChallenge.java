package algorithms.challenge;

public class SquaresOfSortedArrayChallenge {

    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = -4;
        nums[1] = -1;
        nums[2] = 0;
        nums[3] = 3;
        nums[4] = 10;

        sortedSquares(nums);

    }// end method main()

    public static int[] sortedSquares(int[] nums) {

        for (int number: nums) {
            System.out.println(number);
        }
        return nums;
    }// end method sortedSquares()

}