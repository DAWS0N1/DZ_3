package Arrays;

public class ArraysTemplate {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxNegativeIndex = 0, minPozitiveIndex = 0, maxNegative = -11, minPozitive = 11;

        for (int i=0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);

            if (array[i] < 0 && array[i] > maxNegative){
                maxNegative = array[i];
                maxNegativeIndex = i;
            } else if (array[i] > 0 && array[i] < minPozitive) {
                minPozitive = array[i];
                minPozitiveIndex = i;
            }
        }
        System.out.println(java.util.Arrays.toString(array));

        System.out.println("Максимальное отрицательное: [" + maxNegativeIndex + "] " + maxNegative + "; Минимальное положительное: [" + minPozitiveIndex + "] " + minPozitive);

        array[maxNegativeIndex] = minPozitive;
        array[minPozitiveIndex] = maxNegative;

        System.out.println(java.util.Arrays.toString(array));
    }
}
