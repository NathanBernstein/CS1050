public class Feb21{
  public static void main(String[] args){
    int b = 2;
    String msg = " ";
    switch (b){
      case 5: b+=2; break;
      case 7: b+=2; break;
      case 8: msg="Correct"; break;
      case 4: msg="OKAY";break;
      default: msg="invalid"; break;
    }
    System.out.println(b + msg);
  }
}
