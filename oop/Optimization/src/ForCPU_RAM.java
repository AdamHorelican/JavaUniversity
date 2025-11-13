public class ForCPU_RAM {

  private static final double CPU_FACTOR = 1.5e-11;  // Wh per ns
  private static final double RAM_FACTOR = 5.0e-22;  // Wh per (byte * ns)

  private static final int ARRAY_SIZE = 10_000_000;
  private static final int RUNS = 3;

  public static void main(String[] args) {
    int[] data = new int[ARRAY_SIZE];

    for (int i = 0; i < data.length; i++) {
      data[i] = i % 100;
    }

    System.out.println("=== Plain for loop ===");
    measure(false, data);

    System.out.println("\n=== Enhanced for-each loop ===");
    measure(true, data);
  }

  private static void measure(boolean useForEach, int[] array) {
    Runtime rt = Runtime.getRuntime();

    long totalTime = 0;
    long totalMem = 0;
    long lastSum = 0;

    for (int run = 0; run < RUNS; run++) {
      long startMem = rt.totalMemory() - rt.freeMemory();
      long startTime = System.nanoTime();

      long sum = useForEach
          ? For_ForEach.sumForEach(array)
          : For_ForEach.sumFor(array);

      long endTime = System.nanoTime();
      long endMem = rt.totalMemory() - rt.freeMemory();

      long timeNs = endTime - startTime;
      long memBytes = Math.max(0L, endMem - startMem);

      totalTime += timeNs;
      totalMem += memBytes;
      lastSum = sum;
    }

    long avgTimeNs = totalTime / RUNS;
    long avgMemBytes = totalMem / RUNS;

    double cpuEnergyWh = avgTimeNs * CPU_FACTOR;
    double ramEnergyWh = avgTimeNs * avgMemBytes * RAM_FACTOR;

    System.out.println("Last sum = " + lastSum);
    System.out.println("Average time [ns]: " + avgTimeNs);
    System.out.println("Average memory [bytes]: " + avgMemBytes);
    System.out.println("CPU energy [Wh]: " + cpuEnergyWh);
    System.out.println("RAM energy [Wh]: " + ramEnergyWh);
  }
}
