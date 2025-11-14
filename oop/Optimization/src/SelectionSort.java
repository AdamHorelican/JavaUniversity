import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

  public static void main(String[] args) {
    int[] sizes = {100, 1000, 10_000};
    Random rand = new Random();

    for (int n : sizes) {
      System.out.println("n = " + n);

      int[] array1 = new int[n];
      for (int i = 0; i < n; i++) {
        array1[i] = rand.nextInt(1_000_000);
      }

      int[] array2 = Arrays.copyOf(array1, array1.length);

      long start1 = System.nanoTime();
      selectionSort(array1);
      long end1 = System.nanoTime();
      long timeSelection = end1 - start1;

      long start2 = System.nanoTime();
      Arrays.sort(array2);
      long end2 = System.nanoTime();
      long timeArraysSort = end2 - start2;

      System.out.println("SelectionSort: " + timeSelection + " ns");
      System.out.println("Arrays.sort(): " + timeArraysSort + " ns");
      System.out.println();
    }
  }

  public static void selectionSort(int[] array) {
    for (int pos = 0; pos < array.length - 1; pos++) {
      int indexOfMin = min(array, pos);
      swap(array, pos, indexOfMin);
    }
  }

  public static int min(int[] array, int start) {
    int minIndex = start;
    for (int i = start + 1; i < array.length; i++) {
      if (array[i] < array[minIndex]) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  public static void swap(int[] array, int i, int j) {
    int temp  = array[i];
    array[i]  = array[j];
    array[j]  = temp;
  }
}
