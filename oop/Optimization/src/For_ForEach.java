public class For_ForEach
{
  public static long sumFor(int[] array) {
    long sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i];
    }
    return sum;
  }

  public static long sumForEach(int[] array) {
    long sum = 0;
    for (int value : array) {
      sum += value;
    }
    return sum;
  }
}
