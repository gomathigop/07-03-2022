package methodsofString;

public class Example4 {
	public static void main(String[] args)
	{
		/**
		 * replace(CharSequence target, CharSequence replacement):
		 * 
		 * Replaces each substring of this string that matches the literal 
		 * target sequence with the specified literal replacement sequence.
		 * 
		 */
		
		String text = "Welcome to India, Welcome to TamilNadu";
		
		System.out.println(text);
		
		System.out.println(text.replace("to", "2"));
	}

}
