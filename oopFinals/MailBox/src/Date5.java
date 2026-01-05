import java.util.Objects;

public class Date5
{
  private int day;
  private int month;
  private int year;

  public Date5(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public Date5 copy()
  {
    return new Date5(day, month, year);
  }

  @Override
  public String toString()
  {
    return day + "/" + month + "/" + year;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Date5 other = (Date5) obj;
    return day == other.day && month == other.month && year == other.year;
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(day, month, year);
  }
}
