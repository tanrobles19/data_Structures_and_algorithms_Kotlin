package algorithms.challenge;

public class DuplicateZerosNaive {

    public static void main(String[] args) {

        int[] arr = new int[8];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 0;
        arr[5] = 0;
        arr[6] = 0;
        arr[7] = 5;

        for (int i = 0; i < arr.length-1; i++) { // O(n)

            if(arr[i] == 0) {
                System.out.println("I am a Zero");

                for (int x = arr.length - 2; x > i; x--) { //O(n)
                    arr[ x + 1] = arr[x];
                }

                arr[++i] = 0;

            }

        }// end for

        System.out.println(arr.length);


        // Big O Notation
        // O(n) * O(n) quadratic solution

    }

}
