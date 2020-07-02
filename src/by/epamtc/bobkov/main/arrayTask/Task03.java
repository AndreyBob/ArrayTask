package by.epamtc.bobkov.main.arrayTask;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] lock = new int[10];
        int nIndex1 = (int) (Math.random() * 10) ;
        int nIndex2 = (int) (Math.random() * 10);
        int firstValue = (int) (Math.random() * 6) + 1;
        int secondValue = (int) (Math.random() * 6) + 1;
        lock[nIndex1] = firstValue;
        lock[nIndex2] = secondValue;


        if ((firstValue + secondValue) > 9 && ((nIndex1 - nIndex2) > -3 && (nIndex1 - nIndex2) < 3)) {
            flag = false;
            System.out.println("Нельзя вычислить код с данными числами!");
        }
        // пока не будет подобран ключ к сейфу, метод будет работать и заполнять массив случайными числами
        while (flag) {
            for (int i = 0; i < lock.length; i++) {
                if ((i != nIndex1) && (i != nIndex2)) {
                    lock[i] = (int) (Math.random() * 6) + 1;
                } else continue;
            }

            int count = 0;
            //проверка на сумму трех ячеек
            for (int j = 0; j < 8; j++) {
                if ((lock[j] + lock[j+1] + lock[j + 2]) == 10) {
                    count++;
                }
            }
            // если все три соседние ячейки имеют сумму 10, выходит из цикла
            if (count == 8) {
                flag = false;
            } else System.out.println("Не удалось подобрать пароль");
        }
        System.out.println(Arrays.toString(lock));
    }
}
