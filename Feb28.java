public class Feb28{
  public static void main(String[] args){
    for(int i = 0; i < 5; i++){ //These two loops do the same thing, but use different loop types
      System.out.println(i);
    }
    int u = 0;
    while(u<5){ //These two loops do the same thing, but use different loop types
      System.out.println(u);
      u++;
    }
    for(int v = 0,b = 9;v<10;v++,b--){ //Multiple items in for loop
      System.out.println(v+" "+b);
    }
  }
}
