public class StringCPU_RAM
{
  private static final double CPU_FACTOR = 1.5e-11;  // Wh per ns
  private static final double RAM_FACTOR = 5.0e-22;  // Wh per (byte * ns)

  public static void main(String[] args)
  {
    int count = 10_000;

    System.out.println("=== String + ===");
    measure(true, count);

    System.out.println("\n=== StringBuilder ===");
    measure(false, count);
  }

  private static void measure(boolean usePlus, int count) {
    Runtime rt = Runtime.getRuntime();

    long startMem = rt.totalMemory() - rt.freeMemory();
    long startTime = System.nanoTime();

    String result = usePlus
        ? String_StringBuilder.concatPlus(count)
        : String_StringBuilder.concatBuilder(count);

    long endTime = System.nanoTime();
    long endMem = rt.totalMemory() - rt.freeMemory();

    long timeNs = endTime - startTime;
    long memBytes = Math.max(0L, endMem - startMem);

    double cpuEnergyWh = timeNs * CPU_FACTOR;
    double ramEnergyWh = timeNs * memBytes * RAM_FACTOR;

    System.out.println("CPU energy [Wh]: " + cpuEnergyWh);
    System.out.println("RAM energy [Wh]: " + ramEnergyWh);
  }
}
