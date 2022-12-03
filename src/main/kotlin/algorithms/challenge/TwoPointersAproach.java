package algorithms.challenge;

public class TwoPointersAproach {

    public static void main(String[] args) {

        int[] numbers = new int[6];
        numbers[0] = -10;
        numbers[1] = -5;
        numbers[2] = -1;
        numbers[3] = 3;
        numbers[4] = 8;
        numbers[5] = 12;

        int newArray[] = new int[numbers.length];

        int leftIndex = 0;
        int rightIndex = numbers.length -1;

        for (int i = newArray.length -1; i >= 0; i--) {

            int leftNumber = Math.abs(numbers[leftIndex]);
            int rightNumber = Math.abs(numbers[rightIndex]);

            if(leftNumber > rightNumber) {
                newArray[i] = leftNumber * leftNumber;
                leftIndex++;
            }else{
                newArray[i] = rightNumber * rightNumber;
                rightIndex--;
            }

        }// end for

        System.out.println(newArray.toString());

    }// end main method()

}
