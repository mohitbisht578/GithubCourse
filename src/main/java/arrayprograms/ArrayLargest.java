package arrayprograms;

public class ArrayLargest {
	
	public static void main(String[] args) {
			
	  int arr[] = {1, 4, 5, 2, 8};
      int len = arr.length;

      for (int i = 0; i < len; i++) {
          for (int j = i + 1; j < len; j++) {
              if (arr[i] > arr[j]) {
                  int k = arr[i];
                  arr[i] = arr[j];
                  arr[j] = k;
              }
          }
      }

      //array largest
          System.out.println(arr[len - 1]);
      }

}
