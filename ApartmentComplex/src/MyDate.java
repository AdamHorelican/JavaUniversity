import java.time.LocalDate;

public class MyDate
{
  private int day, month, year;

  public MyDate(int day, int month, int year)
  {
    set(day,month,year);
  }
  public MyDate(int day, String monthname, int year)
  {
    set(day,convertToNumberMonth(monthname),year);
  }
  public MyDate(){
    LocalDate today = LocalDate.now();
    set(today.getDayOfMonth(), today.getMonthValue(),today.getYear());
  }
  public void set(int day, int month, int year)
  {
    if(year<0) this.year = year*(-1); else
      this.year = year;
    if(month<1)
      this.month = 1;
    else
      this.month = Math.min(month, 12);

    if(day<1) this.day = 1;
    else
      this.day = Math.min(day, NrOfDaysInMonth());
  }

  public MyDate copy(){
    return new MyDate(day, month,year);
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

  public boolean isLeapYear(){
    return ((getYear() % 4 == 0) && ((getYear() % 100 != 0) || (getYear() % 400
        == 0)));
  }

  public int NrOfDaysInMonth(){
    switch (getMonth()){
      case 4,6,9,11 : return 30;
      case 2 : {if(isLeapYear()) return 29; else return 28;}
      case 1,3,5,7,8,10,12 : return 31;
      default: return 0;
    }
  }

  public String GetMonthName(){
    return switch (getMonth())
    {
      case 1 -> "January";
      case 2 -> "February";
      case 3 -> "March";
      case 4 -> "April";
      case 5 -> "May";
      case 6 -> "June";
      case 7 -> "July";
      case 8 -> "August";
      case 9 -> "September";
      case 10 -> "October";
      case 11 -> "November";
      case 12 -> "December";
      default -> "Invalid month";
    };
  }

  public void StepForwardOneDay(){
    if((getDay()==NrOfDaysInMonth())&&(getMonth()==12))
    {
      set(1,1,getYear()+1);
    }
    else if (getDay()==NrOfDaysInMonth())
    {
      set(1,getMonth()+1,getYear());
    } else {
      set(getDay()+1,getMonth(),getYear());
    }
  }
  public void StepForward(int n){
    for(int i = 0;i<n;i++)
      StepForwardOneDay();
  }

  public boolean isBefore(MyDate x){
    if(getYear()==x.getYear()){
      if(getMonth()==x.getMonth()){
        return getDay() < x.getDay();
      }
      else return getMonth() <x.getMonth();

    } else return getYear()<x.getYear();
  }

  @Override public String
  toString()
  {
    return getDay()+"/"+getMonth()+"/"+getYear();
  }

  public int convertToNumberMonth(String MonthName){

    return switch (MonthName.toLowerCase())
    {
      case "january" -> 1;
      case "february" -> 2;
      case "march" -> 3;
      case "april" -> 4;
      case "may" -> 5;
      case "june" -> 6;
      case "july" -> 7;
      case "august" -> 8;
      case "september" -> 9;
      case "october" -> 10;
      case "november" -> 11;
      case "december" -> 12;
      default -> 0;
    };
  }
}
