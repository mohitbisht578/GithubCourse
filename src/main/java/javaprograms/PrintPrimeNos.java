package javaprograms;

public class PrintPrimeNos {

	  public static void main(String[] args) {

	        int count = 0;
	        for(int i=1; i<=100; i++) {
	            for(int j=2; j<=i-1; j++) {
	                if(i%j==0) {
	                    count++;
	                }
	            }
	            if(count==0) {
	                System.out.print(i + " ");
	            }
	            else {
	                count = 0;
	            }
	        }
	  }
}
