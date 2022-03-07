//Presentation on March 7 by Chris, Josh and Nate
public class presentation{
  public static void main(String[] args){
    String str = "Ovals";
    String str2 = "Squares";
    str = str.substring(1,5); //Takes the substring of Ovals from postition 1 to position 5, returning "vals"
    System.out.println(str);
    int index = str2.indexOf('a');
    str2 = str2.substring(index); //Takes the substring of Squares from postition of 'a', returning "ares"
    System.out.println(str2);
  }
}
