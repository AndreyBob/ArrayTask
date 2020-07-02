package by.epamtc.bobkov.main.arrayTask;

public class Task04 {

    public static void main(String[] args) {
        System.out.println(getMaxFrequencyNum(2,5,6,2,1,1));
    }

    public static int getMaxFrequencyNum(int ... arr) {
        int[] counts = new int[arr.length];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            counts[i]=count;
            if (counts[i]==counts[result])
                result = arr[result] > arr[i] ? i : result;
            else
                result = count > counts[result] ? i : result;
        }
        return arr[result];
    }

}
