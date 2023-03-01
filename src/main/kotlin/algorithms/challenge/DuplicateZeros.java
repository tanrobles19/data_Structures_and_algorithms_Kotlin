package algorithms.challenge;

public class DuplicateZeros {

    public static void main(String[] args) {

        int[] arr = new int[8];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = 0;
        arr[4] = 0;
        arr[5] = 4;
        arr[6] = 5;
        arr[7] = 0;

        int[] newArray = new int[arr.length];
        int newArrayIndex = 0;

        for (int i = 0; i < arr.length && newArrayIndex < arr.length; i++) {

            newArray[newArrayIndex] = arr[i];

            if(arr[i] == 0) {
                ++newArrayIndex;
                if(newArrayIndex == arr.length) {
                    break;
                }
                newArray[newArrayIndex] = 0;
            }

            newArrayIndex++;

        }// end for

        for (int i = 0; i < arr.length; i++) {
            arr[i] = newArray[i];
        }

        System.out.println(newArray.length);


    }// end main method()

}
