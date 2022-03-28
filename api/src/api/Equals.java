package api;

public class Equals {

	public static void main(String[] args) {
		String str1 = "Helllo";
		String str2 = "helllo";
		
		System.out.println(str1.equals(str2)); //대소문자를 따져서 비교
		System.out.println(str1.equalsIgnoreCase(str2)); //대소문자를 무시하고 비교

	}

}
