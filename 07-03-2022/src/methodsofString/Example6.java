package methodsofString;

public class Example6 {
	public static void main(String[] args) 
	{

		/**
		 * 
		 * toCharArray():
		 * 
		 * Converts this string to a new character array.
		 *   
		 */
		
		String message = "Hello How are you, I am fine, thank you";
		
		char characters[] = message.toCharArray();
		
		for(char character: characters)
		{
			System.out.println(character);
		}
		
	}

}
