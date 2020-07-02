package by.epamtc.bobkov.main.arrayTask;

public class Task05 {

    public static void main(String[] args) {
        int[] resultMassive = new int[] {1, 2, 3, 1, 3, 4, 1};
        System.out.println("Cумма ровна - " + findSumMaxEvenAndMinOdd(resultMassive));
    }

    public static double findSumMaxEvenAndMinOdd(int[] A) {
        long maxValue = Long.MIN_VALUE;
        long minValue = Long.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if ((i%2 == 0) && A[i] > maxValue ) {
                maxValue = A[i];
            }
            if ((i%2 != 0) && A[i] < minValue) {
               minValue = A[i];
            }
        }
        return maxValue + minValue;
    }
}
