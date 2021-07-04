package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArraysTemplate {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxNegative = -11, minPozitive = 11;
        List<Integer> maxNegativeIndexes = new ArrayList<Integer>(), minPozitiveIndexes = new ArrayList<Integer>();

        for (int i=0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);
            if (array[i] < 0 && array[i] > maxNegative){
                maxNegative = array[i];
                maxNegativeIndexes.clear();
                maxNegativeIndexes.add(i);
            } else if (array[i] < 0 && array[i] == maxNegative) {
                maxNegativeIndexes.add(i);
            } else if (array[i] > 0 && array[i] < minPozitive) {
                minPozitive = array[i];
                minPozitiveIndexes.clear();
                minPozitiveIndexes.add(i);
            } else if (array[i] > 0 && array[i] == minPozitive) {
                minPozitiveIndexes.add(i);
            }
        }
        System.out.println(java.util.Arrays.toString(array));

        System.out.println("Максимальное отрицательное: " + maxNegativeIndexes + " " + maxNegative + "; Минимальное положительное: " + minPozitiveIndexes + " " + minPozitive);

        for (int i = 0; i < maxNegativeIndexes.size(); i++) {
            array[maxNegativeIndexes.get(i)] = minPozitive;
        }
        for (int i = 0; i < minPozitiveIndexes.size(); i++) {
            array[minPozitiveIndexes.get(i)] = maxNegative;
        }

        System.out.println(java.util.Arrays.toString(array));
    }
}
