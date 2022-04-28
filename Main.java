// Programming Project
// @Author: Nate Bernstein
// @Date:   4/27/2022
// @Class:  CS1050 Sec2
// @Email:  nbernst3@msudenver.edu

import java.util.ArrayList;
class Student{
  //define class variables name,email and studentnumber
  String name;
  String email;
  int stnum;
  public Student(String name,String email,int stnum) {
    // initialize class variables
    this.name = name;
    this.email = email;
    this.stnum = stnum;
  }

  public String toString() {
    //print all class variables
    String str="Name: "+this.name+" Email: "+this.email+" Student Number: "+this.stnum;
    return str;
  }
}
class Book{
    //define class variables bookid,bookname,author
    int bookid;
    String name;
    String author;
    public Book(int bookid,String name,String author) {
      // initialize class variables
      this.bookid = bookid;
      this.name = name;
      this.author = author;
    }
    public String toString() {
      //print all class variables
      String str="BookID: "+this.bookid+" Name: "+this.name+" Author: "+this.author;
      return str;
    }
}
class Library{
  ArrayList<Student> roster = new ArrayList<Student>();
  ArrayList<Book> catalog = new ArrayList<Book>();
  public int addmember(String name,String email,int num){
    /*check if the given email is valid- you need to check only if @
    and .(dot) is present and have three letters after the dot */
    //if email is valid add member and return 1 ,else return -1
    int hasNecc = 0;
    if(email.indexOf("@")==-1){
      return -1;
    }
    if(email.indexOf(".")==-1){
      return -1;
    }
    for(int i=email.indexOf(".");i<email.length();i++){
      hasNecc+=1;
    }
    if(hasNecc==3){
      roster.add(new Student(name, email, num));
      return 1;
    }
    else{
      return -1;
    }
  }
  public void deletemember(String name) {
    //accept name in parameter remove member from list
    for(int i =0;i<roster.size();i++){
      if(roster.get(i).name==name){
        roster.remove(i);
      }
    }
  }
  public void addbook(int bookid,String name,String author){
    //accept book details in parameter and add book to list
    catalog.add(new Book(bookid, name, author));
  }
  public int searchbook(String name) {
    //accept bookname in parameter, search and return index if found
    for(int i =0;i<catalog.size();i++){
      if(catalog.get(i).name==name){
        return i;
      }
    }
    return -1;
    // return index
  }
  public void lendbook(String name) {
    //accept the book to lend as parameter and remove from list
    for(int i =0;i<catalog.size();i++){
      if(catalog.get(i).name==name){
        catalog.remove(i);
      }
    }
  }
  public void returnbook(int bookid,String name,String author) {
    //accept the book to return as parameter and add back to list
    catalog.add(new Book(bookid, name, author));
  }
  public void prnStudents(){
    System.out.println(roster);
  }
  public void prnBook(){
    System.out.println(roster);//print book catalog
  }
}
public class Main
{
   // main method for testing
   public static void main(String[] args)
   {
     Library MSULibrary=new Library();
     int done= MSULibrary.addmember("Jeff", "jeff@gmail.com", 789012);
     int done1= MSULibrary.addmember("Jeffery", "jeffery@gmail.com", 123456);
     int done2= MSULibrary.addmember("Bobby", "bobby@gmail.com", 573824);
     int done3= MSULibrary.addmember("Bob", "bob@gmail.com", 924832);
     // add few more members
     MSULibrary.deletemember ("Jeff");
     MSULibrary.addbook(1, "GRIT","Duckworth");
     MSULibrary.addbook(2, "Ender's Game","Card");
     MSULibrary.addbook(3, "The Odyssey","Homer");
     MSULibrary.addbook(4, "The Iliad","Homer");
     // add few more books
     int num= MSULibrary.searchbook("GRIT");
     System.out.println("Search for 'GRIT' gives: "+ num);
     // if search is successful call and test lendbook method

     //call and test returnbook method
     //call and test printing function for roster and catalog

   }
 }
