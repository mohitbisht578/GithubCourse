package stringprograms;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		
	 String str = "welcome to java";
     String words[] = str.split(" ");
     String revStr = "";

     for(String w : words) {
         String revWord = "";
         for(int i=w.length()-1; i>=0; i--) {
             revWord = revWord + w.charAt(i);
         }
         revStr = revStr+revWord+" ";
     }

     System.out.println(revStr);
     
	}

}
