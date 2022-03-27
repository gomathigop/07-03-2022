package methodsofString;

public class Example11 {

	public static void main(String[] args) 
	{

		/**
		 * 
		 * trim():
		 * 
		 * Returns a string whose value is this string, with 
		 * any leading and trailing whitespace removed.
		 * 
		 */
		
		String message = " Hello How are you " ;
		
		System.out.println(message.length());
		System.out.println(message);
		
		System.out.println("===============================================");
		
		String text = message.trim();//trim() used
		
		System.out.println(text.length());
		System.out.println(text);
		
		
		
			
		
	}

}
