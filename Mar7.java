public class Mar7{
  public static void main(String[] args){
    String str = "First day without masks!";
    String str2 = "FIrsT dAy wIthOut mASks!";
    System.out.println(str.charAt(3));
    str = str.toUpperCase();
    System.out.println(str);
    str = str.toLowerCase();
    System.out.println(str);
    Boolean istrue = str.equalsIgnoreCase(str2);
    System.out.println(istrue);
    int index = str.indexOf('m');
    System.out.println(index);
    int index2 = str.indexOf('s',2);
    System.out.println(index2);
    int index3 = str.lastIndexOf('s');
    System.out.println(index3);
    System.out.println(str.length());
    System.out.println(str.substring(0,10));
  }
}
