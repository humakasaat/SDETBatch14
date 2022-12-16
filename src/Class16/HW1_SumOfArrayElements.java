package Class16;

public class HW1_SumOfArrayElements {
  static int sum( int[] arr){
      int sum=0;
      for( int i=0; i< arr.length; i++){
          sum=sum+arr[i];
      }
      return sum;
  }

    public static void main(String[] args) {
        HW1_SumOfArrayElements obj= new HW1_SumOfArrayElements();
        int [] a={ 1,5,8,10,40, 38,67};
        System.out.println(sum(a));
    }


}
