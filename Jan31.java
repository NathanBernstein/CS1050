public class Jan31{
  public static void main(String[] args){
    int a = 20;
    int b = 30;
    int c;
    c = (a<=b)?a:b; //tenary operator - if statement is true, then take the first(a), else take the second(b)
    System.out.println(c);

    int i = ++a + ++a + a++; // 21 + 22 + 22 (third statement adds after call, therefore doesn't affect i)
    System.out.println(i);

    String message1 = "This is a test"; //practicing string methods
    String message2 = "Hello Class";

    System.out.println(message1.length()); //prints length of message1
    System.out.println(message2.length()); //prints length of message2

    System.out.println(message1.substring(0,3)); //prints from position 0 (T) up to position 3 (s) DOES NOT INCLUDE
    System.out.println(message1.substring(2,3)); //prints from position 2 (i) up to position 3 (s) DOES NOT INCLUDE
    System.out.println(message1.substring(5)); //prints from position 5 (i) up to end of string

    System.out.println(message1.indexOf("is")); // This will match the is in "This"
    System.out.println(message1.indexOf("Hello")); //prints -1 because it does not exist
    System.out.println(message2.indexOf("Hello")); //prints 0 because Hello starts at position 0

    System.out.println(message2.toLowerCase()); //put message2 in lower case
    System.out.println(message2.toUpperCase()); //put message2 in upper case

    int f = 5; //Review of toString method
    String l = Integer.toString(f); //make sure to use Interger or whatever type converting from
    System.out.println(l);

    int var1 = 5; int var2 = 6;int var3;
    var3 = ++ var2 * var1 / var2 +var2;
    System.out.println(var3);

    double num1 =12.35;
    char letter = 'A';
    num1 = 4;
    num1-=10;
    System.out.println(num1);
    System.out.println(letter);

    //Math.random syntax
    int aa = ((int)Math.random()); // aa is between 0-9
    System.out.println(aa);
  }
}
