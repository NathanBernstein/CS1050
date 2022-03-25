/*
Nate Bernstein
CS1050
March 22
*/
public class Holiday{
  private String name;
  private int day;
  private String month;
  public Holiday(String name,int day,String month){
    this.name = name;
    this.day = day;
    this.month = month;
  }
  public static boolean isSameMonth(Holiday h1,Holiday h2){
    boolean istrue = false;
    if (h1.month.equals(h2.month)){
      istrue = true;
    }
    return istrue;
  }
  public static void main(String[] args){
    Holiday holiday1 = new Holiday("Indepence Day",4,"July");
    Holiday holiday2 = new Holiday("Indepence Day",4,"July");
    Holiday holiday3 = new Holiday("New Years",1,"January");
    System.out.println(isSameMonth(holiday1,holiday2));
    System.out.println(isSameMonth(holiday1,holiday3));
  }
}
