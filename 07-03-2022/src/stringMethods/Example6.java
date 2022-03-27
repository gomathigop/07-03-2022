package stringMethods;

public class Example6 {
	public static void main(String[] args) 
	{
		
		/**
		 * equals(Object anObject):
		 * 
		 * Compares this string to the specified object.
		 * 
		 * ================================================
		 * 
		 * equalsIgnoreCase(String anotherString):
		 * 
		 * Compares this String to another String, ignoring case considerations.
		 * 
		 */		
		
		String text1 = "Viji";
		
		String text2 = "viji";
		
		String text3 = "Girl";
		
		String text4 = "Viji";
		
		String text5 = "viji 123";	

		System.out.println(text1.equals(text2));
		System.out.println(text1.equals(text3));
		System.out.println(text1.equals(text4));
		
		System.out.println("==========================");
		
		System.out.println(text1.equalsIgnoreCase(text2));
		
	}

}



