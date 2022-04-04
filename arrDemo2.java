import java.util.Scanner;
public class arrDemo2{
  public static int howManyTimes(int i,int[] arr){
    int cnt=0;
    for(int j=0;j<arr.length;j++){
      if(arr[j]==i){
        cnt++;
      }
    }
    return cnt;
  }
  public static void main(String[] args){
    int[] arr = {7,8,1,2,6,8,7,1,4,9};
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter your integer to see if it's in the array: ");
    int var = inp.nextInt();
    inp.close();
    int occ = howManyTimes(var,arr);
    System.out.println(var+" occurs "+occ+" times in the array.");
  }
}
