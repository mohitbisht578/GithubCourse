package javaprograms;

public class FibonacciSeries {

	
	   public static void main(String[] args) {

	        int a=0;
	        int b=1;

	        //0 1 1 2 3 5 8

	        System.out.printf(a + " " + b);

	        for(int i=1; i<=8; i++) {
	            int c = a + b;
	            System.out.printf(" " + c);
	            a = b;
	            b = c;
	        }
	   }
}
