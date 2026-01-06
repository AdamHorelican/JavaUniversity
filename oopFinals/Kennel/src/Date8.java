public class Date8
{
  private int day;
  private int month;
  private int year;

  public Date8(int day, int month, int year) {
    set(day, month, year);
  }

  public void set(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }

  public Date8 copy() {
    return new Date8(day, month, year);
  }

  @Override
  public String toString() {
    return day + "." + month + "." + year;
  }
}
