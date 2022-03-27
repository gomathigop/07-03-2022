package methodsofString;

public class Example7 {
	public static void main(String[] args) 
	{

		/**
		 * 
		 * startsWith(String prefix):
		 * 
		 * Tests if this string starts with the specified prefix.
		 *   
		 */
		
		String message = "Hello How are you, I am fine, thank you";
		
		System.out.println(message.startsWith("Hello"));
		
		System.out.println(message.startsWith("are"));
		
		System.out.println(message.startsWith("How are you"));
		
		System.out.println(message.startsWith("Hello How are you"));
		
		System.out.println(message.startsWith("H"));
		
	}


}
