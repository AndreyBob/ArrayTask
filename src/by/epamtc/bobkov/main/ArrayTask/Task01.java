package by.epamtc.bobkov.main.ArrayTask;

public class Task01 {

    public static void main(String[] args) {

        System.out.format("Наибольшая сумма - %.2f", findMaxValueOfMassive(6));
    }

    public static double findMaxValueOfMassive(int count) {
        double [] resultMassive = new double[count * 2];
        for (int i = 0; i < resultMassive.length; i++) {
            resultMassive[i] = Math.random() * 100;
        }
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < resultMassive.length / 2; i++) {
            double sumOfNums = resultMassive[i] + resultMassive[resultMassive.length - (i + 1) ];
            if (maxValue < sumOfNums) {
                maxValue = sumOfNums;
            }
        }
        return maxValue;
    }
}
