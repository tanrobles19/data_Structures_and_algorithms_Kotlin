package algorithms.challenge;

public class FindNumbersWithEvenNumberOfDigitsChallenge {

//    even number= Numero Par
//    odd number= Numero Impar

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 555;
        nums[1] = 901;
        nums[2] = 482;
        nums[3] = 1771;

        System.out.println(findNumbers(nums));

    }

    public static int findNumbers(int[] nums) {

        int count = 0;

        for (int num : nums) {

            if (countDigit(num) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    // How to compute the number of digits of a number?
    private static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }// end countDigit()

}
