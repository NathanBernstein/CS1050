public class Apr18{
  public static void main(String[] args){
    char[][] charArr = new char[3][2];
    for(int i=0;i<3;i++){
      for(int j=0;j<2;j++){
        charArr[i][j]='a';
      }
    }
    System.out.println(charArr[1][1]);
  }
}
