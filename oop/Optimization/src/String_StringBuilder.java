public class String_StringBuilder
{

  public static String concatPlus(int count) {
    String s = "";
    for (int i = 0; i < count; i++) {
      s += i;
    }
    return s;
  }

  public static String concatBuilder(int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(i);
    }
    return sb.toString();
  }
}
