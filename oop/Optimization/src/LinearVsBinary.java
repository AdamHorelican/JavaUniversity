import java.util.Random;

public class LinearVsBinary
{

  public static void main(String[] args) {
    int[] sizes = {100, 10_000, 1_000_000};
    Random rand = new Random();

    for (int n : sizes) {
      System.out.println("n = " + n);

      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = i;
      }

      int target = n - 1;

      long start1 = System.nanoTime();
      int indexLinear = linearSearch(array, target);
      long end1 = System.nanoTime();
      long timeLinear = end1 - start1;

      long start2 = System.nanoTime();
      int indexBinary = binarySearch(array, target);
      long end2 = System.nanoTime();
      long timeBinary = end2 - start2;

      System.out.println("Linear search index: " + indexLinear + ", time: " + timeLinear + " ns");
      System.out.println("Binary search index: " + indexBinary + ", time: " + timeBinary + " ns");
      System.out.println();
    }
  }

  public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  }

  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (array[mid] == target) {
        return mid;
      } else if (array[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
