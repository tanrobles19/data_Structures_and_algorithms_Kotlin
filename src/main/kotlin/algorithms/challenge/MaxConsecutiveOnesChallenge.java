package algorithms.challenge;

public class MaxConsecutiveOnesChallenge {

    public static void main(String[] args) {
        int[] nums = new int[6];
        nums[0] = 1;
        nums[1] = 1;
        nums[2] = 0;
        nums[3] = 1;
        nums[4] = 1;
        nums[5] = 1;

        System.out.println(findMaxConsecutiveOnes(nums));

    }// end method main()

    public static int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] == 1) {
                count++;
                if(count > max) {
                    max = count;
                }
            }

            if(nums[i] == 0) {
                count = 0;
            }

        }// end for
        return max;
    }// end method findMaxConsecutiveOnes()

}
