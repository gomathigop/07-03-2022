package stringMethods;

public class Example4 {
	public static void main(String[] args) 
	{
		
		/**
		 * contains(CharSequence s):
		 * 
		 * Returns true if and only if this string contains the 
		 * specified sequence of char values.
		 * 
		 */
		
		String text = "viji is a good girl";
		
		System.out.println(text.contains("is"));
		System.out.println(text.contains("Is"));
		System.out.println(text.contains("girl"));
		System.out.println(text.contains("Viji"));
		System.out.println(text.contains("viji"));


	}


}
