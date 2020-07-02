package by.epamtc.bobkov.main.arraytask;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMinValueOfMassive(7)));
    }

    public static int[] findMinValueOfMassive(int quantity) {
        int[] firstMassive = new int[quantity];
        int count = 0;
        for (int i = 0; i < firstMassive.length; i++) {
            firstMassive[i] = (int) (Math.random() * 100);
        }
        int minValue = firstMassive[0];
        for (int i = 1; i < firstMassive.length; i++) {
            if (minValue > firstMassive[i]) {
                minValue = firstMassive[i];
            }
        }
        for (int i = 0; i < firstMassive.length; i++) {
            if (minValue == firstMassive[i]) {
               count++;
            }
        }
        int[] resultMassive = new int[firstMassive.length - count];
        for (int i = 0,  j = 0; i < firstMassive.length; i++) {
            if (firstMassive[i] != minValue) {
                resultMassive[j] = firstMassive[i];
                j++;
            }
        }
       return resultMassive;
    }
}
