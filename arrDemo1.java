public class arrDemo1{
  public static int LengthOfArray(String[] arr){
    int var = 0;
    for(int i=0;i<arr.length;i++){
      var+=1;
    }
    return var;
  }
  public static int LengthOfArray(char[] arr){
    int var = 0;
    for(int i=0;i<arr.length;i++){
      var+=1;
    }
    return var;
  }
  public static int LengthOfArray(int[] arr){
    int var = 0;
    for(int i=0;i<arr.length;i++){
      var+=1;
    }
    return var;
  }
  public static void main(String[] args){
    String[] fruits = {"Guava","Banana","Apple","Papaya","Melon","Strawberry"};
    char[] alphabets = {'m','p','k','l','t'};
    int[] numbers = {12,25,63,84,90,11,54};
    int arrayLength;
    arrayLength= LengthOfArray(fruits);
    System.out.println(arrayLength);
    arrayLength= LengthOfArray(alphabets);
    System.out.println(arrayLength);
    arrayLength= LengthOfArray(numbers);
    System.out.println(arrayLength);
  }
}
