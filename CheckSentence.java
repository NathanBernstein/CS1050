// Extra Credit Assignment
// @Author: Nate Bernstein
// @Date:   4/27/2022
// @Class:  CS1050 Sec2
// @Email:  nbernst3@msudenver.edu


public class CheckSentence{

    public static void main(String[] args) {
      String sent = "Hello my name is Nate.";
      String sent2 = "fsdkjfnadfsk";
      check(sent);
      check(sent2);
    }
    public static void check(String sentence){
      System.out.println("Checking: "+sentence);
      int cntSpaces = 0;
      String uppers = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String punct = "!.?";
      boolean isSent = false;
      for(int i = 0;i<sentence.length();i++){
        if(i==0){
          if(uppers.indexOf(sentence.charAt(i))==-1){
              System.out.println("Sentence does not start with a captial!");
          }
        }
        if(sentence.charAt(i)==' '){
          cntSpaces+=1;
        }
        if(i==sentence.length()-1){
          if(punct.indexOf(sentence.charAt(i))==-1){
              System.out.println("Sentence does not end with punctuation!");
          }
        }
      }
      if (cntSpaces>1){
        System.out.println("This is a sentence!");
        isSent = true;
      }
      else{
        System.out.println("Sentence does not have 3 or more words!");
      }
      System.out.println("\""+sentence+"\" is a sentence? "+isSent);
    }
}
