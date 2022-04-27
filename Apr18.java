public class Apr18{
  public static void main(String[] args){
    char[][] charArr = new char[3][2];
    int[][] numArr = {{1,2},{3,3},{2,1}};
    for(int i=0;i<charArr.length;i++){
      for(int j=0;j<charArr[0].length;j++){
        charArr[i][j]='a';
        System.out.println(numArr[i][j]);
      }
    }
    System.out.println(charArr[1][1]);
  }
}
