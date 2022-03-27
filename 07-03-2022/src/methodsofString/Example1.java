package methodsofString;

public class Example1 {
public static void main(String[] args) {
		
		/**
		 * join(CharSequence delimiter, CharSequence... elements):
		 * 
		 * Returns a new String composed of copies of the CharSequence elements 
		 * joined together with a copy of the specified delimiter.
		 * 
		 */
		
		String text = String.join(" ", "Welcome", "to", "India");
		
		System.out.println(text);
	}

}




