import java.util.Random;

public class CountSpecificNumbers
{

  public static void main(String[] args) {
    int size = 1_000_000;
    int digit = 7;

    int[] numbers = new int[size];
    Random rand = new Random();
    for (int i = 0; i < size; i++) {
      numbers[i] = rand.nextInt(1_000_000_000);
    }

    long start1 = System.nanoTime();
    long countString = countDigitString(numbers, digit);
    long end1 = System.nanoTime();
    long timeString = end1 - start1;

    long start2 = System.nanoTime();
    long countMath = countDigitMath(numbers, digit);
    long end2 = System.nanoTime();
    long timeMath = end2 - start2;

    System.out.println("Digit: " + digit);
    System.out.println("Count (String): " + countString + ", time: " + timeString + " ns");
    System.out.println("Count (Math):   " + countMath + ", time: " + timeMath + " ns");
  }

  public static long countDigitString(int[] numbers, int digit) {
    char target = (char) ('0' + digit);
    long count = 0;
    for (int n : numbers) {
      int x = Math.abs(n);
      if (x == 0 && digit == 0) {
        count++;
      }
      String s = Integer.toString(x);
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == target) {
          count++;
        }
      }
    }
    return count;
  }

  public static long countDigitMath(int[] numbers, int digit) {
    long count = 0;
    for (int n : numbers) {
      int x = Math.abs(n);
      if (x == 0 && digit == 0) {
        count++;
      }
      while (x > 0) {
        int d = x % 10;
        if (d == digit) {
          count++;
        }
        x /= 10;
      }
    }
    return count;
  }
}
