package methodsofString;

public class Example3 {
	public static void main(String[] args) 
	{

		/**
		 * replace(char oldChar, char newChar):
		 * 
		 * Returns a string resulting from replacing all occurrences of 
		 * oldChar in this string with newChar.
		 */
				
		String message = "Hello How are you, I am fine, thank you";
		
		System.out.println(message);
		
		System.out.println(message.replace('H', 'h'));
		
		System.out.println(message.replace('e', 'E'));
		
	}

}
