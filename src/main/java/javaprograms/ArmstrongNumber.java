package javaprograms;

public class ArmstrongNumber {
	
	 public static void main(String[] args) {

	        int num = 153, rem, sum= 0;
	        int number = num;

	        while (num != 0) {

	            rem = num % 10;
	            sum = sum + rem*rem*rem;
	            num = num / 10;

	        }
	        System.out.println(sum);

	        if(sum == number)
	            System.out.println(sum + " is an Armstrong number");
	        else
	            System.out.println(sum + " is not an Armstrong number");
	    }

}
