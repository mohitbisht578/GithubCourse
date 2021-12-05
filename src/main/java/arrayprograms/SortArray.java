package arrayprograms;

public class SortArray {

	public static void main(String[] args) {
	
		int arr[] = {1, 4, 2 ,8, 10};
		int len = arr.length;
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
