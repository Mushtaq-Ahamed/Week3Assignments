package week3.assignments;

public class Palindrome {

	public static void main(String[] args) {

		String value = "madam";
		String rev ="";
		
		for (int i = value.length()-1; i >=0; i--) {
			
			rev=rev + value.charAt(i);
			
		}
		
		if (value.equalsIgnoreCase(rev)){
			System.out.println("Given string is palindrom");	
			}else {
				System.out.println("Given string is not palindrom");	
			}

	}

}
