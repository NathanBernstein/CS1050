/*
Nate Bernstein
CS1050
March 22
*/
public class Movie{
  private final String title;
  private final String studio;
  private final String rating;
  public Movie(String title,String studio){
    this(title,studio,"PG");
  }
  public Movie(String title,String studio,String rating){
    this.title = title;
    this.studio = studio;
    this.rating = rating;
  }
  public static void main(String[] args){
    Movie mv1 = new Movie("Casino Royale","Eon Productions","PG13");
    System.out.println(mv1.title+" "+mv1.studio+" "+mv1.rating);
    Movie mv2 = new Movie("Casino Royale","Eon Productions");
    System.out.println(mv2.title+" "+mv2.studio+" "+mv2.rating);
  }
}
